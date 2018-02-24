package boulderstudios.com.boilerplate.presentation;

/**
 * Created by yuval on 2/24/18.
 */

public abstract class IMvpPresenter<IView extends IMvpView> {

    private final IView mView;

    public IMvpPresenter(IView view) {
        mView = view;
        setViewInterface(mView);
    }

    protected IView getView() {
        return mView;
    }

    protected abstract void setViewInterface(IView view);
}

