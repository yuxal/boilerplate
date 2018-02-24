package boulderstudios.com.boilerplate.presentation;

/**
 * Created by yuval on 2/24/18.
 */

public interface IMvpView<T extends IPresenterInterface> {

    /**
     * Will be called in case an IMvpPresenter will be created with this view in order to
     * attach the presenter's callbacks to the view.
     * always implement with saving the presenter interface as a member
     * @param presenterInterface
     */
    void setPresenterInterface(T presenterInterface);

    void showProgress();

    void hideProgress();
}
