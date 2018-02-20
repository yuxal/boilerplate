package boulderstudios.com.boilerplate.errors;

/**
 * Created by yuval on 2/18/18.
 */

public abstract class ErrorResolver {

    public final void handleError(AppError error) {
        throw new RuntimeException("Receieved unknown error", error);
    }

    public abstract void handleError(ServerUnavailableError error);
}
