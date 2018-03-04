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

        // To use crashlytics, add the fabric id in the manifset and change USE_CRASHLYTICS to
        // true in build.gradle(root)
        //Fabric.with(this, new Crashlytics());
    }

    public static Context getInstance() {
        return sInstance;
    }
}
