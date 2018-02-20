package boulderstudios.com.boilerplate.entities.executor;

import boulderstudios.com.boilerplate.entities.interactor.IInteractor;

/**
 * Created by yuval on 4/29/17.
 */

/**
 *  Interface for executors meant to run the application's interactors (use cases) in a specific ordering or
 *  optimizing the concurrency of said use cases
 */
public interface IExecutor {

    /**
     * Execute a certain interactor/usecase
     * @param interactor
     */
    void execute(IInteractor interactor);
}
