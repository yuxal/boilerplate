package boulderstudios.com.boilerplate.data.errors;

/**
 * Created by yuval on 2/15/18.
 */

public abstract class AppError extends Exception {

    /**
     * All errors must implement this method and pass in self (@see <a href="https://en.wikipedia.org/wiki/Visitor_pattern</a>
     * to allow for deferring an error from the inner components to the UI
     * @param errorResolver the error resolver to handle this error
     */
    public abstract void resolve(ErrorResolver errorResolver);
}
