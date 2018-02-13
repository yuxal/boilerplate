package boulderstudios.com.boilerplate.entities.executor.impl;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import boulderstudios.com.boilerplate.entities.executor.IExecutor;
import boulderstudios.com.boilerplate.entities.interactor.IInteractor;

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
    public void execute(final IInteractor interactor) {
        mThreadPoolExecutor.execute(new Runnable() {
            @Override
            public void run() {
                // run the main logic
                interactor.start();
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
