package boulderstudios.com.boilerplate.data.errors.resolvers;

import boulderstudios.com.boilerplate.data.errors.ErrorResolver;
import boulderstudios.com.boilerplate.data.errors.ServerUnavailableError;
import boulderstudios.com.boilerplate.data.errors.UserLoggedOutError;

/**
 * Created by yuval on 2/24/18.
 */

/**
 * convenience simple implementation that throws exceptions on unimplemented calls
 */

public class SimpleErrorResolver extends ErrorResolver {

    @Override
    public void handleError(ServerUnavailableError error) {
        throw new RuntimeException(error);
    }

    @Override
    public void handleError(UserLoggedOutError error) {
        throw new RuntimeException(error);
    }
}
