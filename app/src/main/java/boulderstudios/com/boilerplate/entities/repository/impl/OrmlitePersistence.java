package boulderstudios.com.boilerplate.entities.repository.impl;

import android.content.Context;

import boulderstudios.com.boilerplate.entities.repository.IPersistence;

/**
 * Created by yuval on 3/5/18.
 */


public class OrmlitePersistence implements IPersistence {
    private static OrmlitePersistence sInstance;

    private OrmlitePersistence(Context context) {
        DatabaseHelper databaseHelper = new DatabaseHelper(context);
        // Example of getting a userDao
        /*try {
            mUserDao = databaseHelper.getUserDao();
        } catch (SQLException e) {
            throw new IllegalStateException("fail to instantiate ormLiteEventRepository", e);
        }*/

    }

    public static synchronized OrmlitePersistence getInstance(Context context) {
        if (sInstance == null) {
            sInstance = new OrmlitePersistence(context);
        }
        return sInstance;
    }

}
