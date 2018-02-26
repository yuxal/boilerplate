package boulderstudios.com.boilerplate.data.errors;

/**
 * Created by yuval on 2/24/18.
 */

public class UserLoggedOutError extends AppError {
    @Override
    public void resolve(ErrorResolver errorResolver) {
        errorResolver.handleError(this);
    }
}
