package boulderstudios.com.boilerplate.errors;

/**
 * Created by yuval on 2/15/18.
 */

public abstract class AppError extends Exception {

    public abstract String getErrorId();
}
