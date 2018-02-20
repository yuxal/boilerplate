package boulderstudios.com.boilerplate.entities.model;

import boulderstudios.com.boilerplate.errors.AppError;

/**
 * Created by yuval on 2/15/18.
 */

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
