package boulderstudios.com.boilerplate.domain.executor.impl;

import android.os.Handler;
import android.os.Looper;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import boulderstudios.com.boilerplate.domain.executor.IExecutor;
import boulderstudios.com.boilerplate.domain.interactor.IInteractor;
import boulderstudios.com.boilerplate.data.model.Result;

/**
 * Created by yuval on 2/13/18.
 */

public class BackgroundThreadExecutor implements IExecutor {

    private static volatile BackgroundThreadExecutor sBackgroundThreadExecuter;

    private static final int CORE_POOL_SIZE = 3;
    private static final int MAX_POOL_SIZE = 5;
    private static final int KEEP_ALIVE_TIME = 120;
    private static final TimeUnit TIME_UNIT = TimeUnit.SECONDS;
    private static final BlockingQueue<Runnable> WORK_QUEUE = new LinkedBlockingQueue<Runnable>();
    private final Handler mHandler = new Handler(Looper.getMainLooper());

    private ThreadPoolExecutor mThreadPoolExecutor;

    private BackgroundThreadExecutor() {
        long keepAlive = KEEP_ALIVE_TIME;
        mThreadPoolExecutor = new ThreadPoolExecutor(
                CORE_POOL_SIZE,
                MAX_POOL_SIZE,
                keepAlive,
                TIME_UNIT,
                WORK_QUEUE);
    }

    @Override
    public <T> void execute(final IInteractor<T> interactor) {
        mThreadPoolExecutor.execute(new Runnable() {
            @Override
            public void run() {
                // run the main logic
                final Result<T> result = interactor.start();
                mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        interactor.finish(result);
                    }
                });
            }
        });
    }

    public static IExecutor getInstance() {
        if (sBackgroundThreadExecuter == null) {
            sBackgroundThreadExecuter = new BackgroundThreadExecutor();
        }

        return sBackgroundThreadExecuter;
    }
}
