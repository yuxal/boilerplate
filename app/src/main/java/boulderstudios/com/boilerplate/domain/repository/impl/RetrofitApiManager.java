package boulderstudios.com.boilerplate.domain.repository.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import boulderstudios.com.boilerplate.domain.repository.IApiManager;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by yuval on 2/25/18.
 */

public class RetrofitApiManager implements IApiManager {

    private static final String BASE_URL = "http://www.google.com";
    private static RetrofitApiManager sInstance;

    private RetrofitApiManager() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss Z").create();
        Retrofit retrofit = new Retrofit.Builder()
                .client(new OkHttpClient.Builder().build())
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
    }

    public static synchronized RetrofitApiManager getInstance() {
        if (sInstance == null) {
            sInstance = new RetrofitApiManager();
        }
        return sInstance;
    }
}
