package boulderstudios.com.boilerplate.domain.interactor;

/**
 * Created by yuval on 2/13/18.
 */

import boulderstudios.com.boilerplate.data.model.Result;

/**
 * An interactor is equal to a "Use case". it's meant to encapsulate all the business logic of a
 * certain use case. i.e: "getAllUsers" which will encapsulate the actual inner workings of achieving
 * this
 */
public interface IInteractor<T> {
    Result<T> start();

    void finish(Result<T> result);
}
