package boulderstudios.com.boilerplate.data.model;

/**
 * Created by yuval on 2/15/18.
 */

import boulderstudios.com.boilerplate.data.errors.AppError;

/**
 * Encapsulate a result from a respository
 */
public class Result<T> {

    private final T mResult;
    private final AppError mError;

    public Result(T result, AppError error) {
        mResult = result;
        mError = error;
    }

    public AppError getError() {
        return mError;
    }

    public T getResult() {
        return mResult;
    }
}
