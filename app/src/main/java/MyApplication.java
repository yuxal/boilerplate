import android.app.Application;
import android.content.Context;

/**
 * Created by yuval on 2/25/18.
 */

public class MyApplication extends Application {

    private static MyApplication sInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;
        // Initialize app wide components here
    }

    public static Context getInstance() {
        return sInstance;
    }}
