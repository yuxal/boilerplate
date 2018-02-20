package boulderstudios.com.boilerplate.entities.interactor;

/**
 * Created by yuval on 2/13/18.
 */

/**
 * An interactor is equal to a "Use case". it's meant to encapsulate all the business logic of a
 * certain use case. i.e: "getAllUsers" which will encapsulate the actual inner workings of achieving
 * this
 */
public interface IInteractor {
    void start();
}
