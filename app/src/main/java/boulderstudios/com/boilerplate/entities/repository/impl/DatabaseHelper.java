package boulderstudios.com.boilerplate.entities.repository.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.support.ConnectionSource;

/**
 * Created by yuval on 3/5/18.
 */

public class DatabaseHelper extends OrmLiteSqliteOpenHelper {

    private static final String DATABASE_NAME    = "ormlite.db";
    private static final int    DATABASE_VERSION = 1;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db, ConnectionSource connectionSource) {
        /*try {
            TableUtils.createTable(connectionSource, OrmLiteUser.class);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }*/
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, ConnectionSource connectionSource,
            int oldVersion, int newVersion) {
        /*try {
            TableUtils.dropTable(connectionSource, OrmLiteUser.class, true);
            onCreate(db, connectionSource);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }*/
    }

    /* User */

    /*public Dao<OrmLiteUser, String> getUserDao() throws SQLException {
        if (mUserDao == null) {
            mUserDao = getDao(<OrmUserClass Here>.class);
        }

        return mUserDao;
    }*/
}
