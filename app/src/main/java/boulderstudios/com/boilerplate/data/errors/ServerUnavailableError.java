package boulderstudios.com.boilerplate.data.errors;

/**
 * Created by yuval on 2/20/18.
 */

public class ServerUnavailableError extends AppError {

    @Override
    public void resolve(ErrorResolver errorResolver) {
        errorResolver.handleError(this);
    }
}
