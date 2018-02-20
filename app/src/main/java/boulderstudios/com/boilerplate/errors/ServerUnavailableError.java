package boulderstudios.com.boilerplate.errors;

/**
 * Created by yuval on 2/20/18.
 */

class ServerUnavailableError extends AppError {

    @Override
    public void resolve(ErrorResolver errorResolver) {
        errorResolver.handleError(this);
    }
}
