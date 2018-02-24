package boulderstudios.com.boilerplate.errors;

/**
 * Created by yuval on 2/18/18.
 */

public abstract class ErrorResolver {

    public abstract void handleError(ServerUnavailableError error);
}
