package boulderstudios.com.boilerplate.presentation.presenters;

import boulderstudios.com.boilerplate.domain.executor.IExecutor;
import boulderstudios.com.boilerplate.presentation.IMvpPresenter;
import boulderstudios.com.boilerplate.presentation.mvpviewinterfaces.IMainView;

/**
 * Created by yuval on 2/24/18.
 */

public class DefaultMainViewPresenter extends IMvpPresenter<IMainView> implements
        IMainView.PresenterInterface {

    private final IExecutor mExecutor;

    public DefaultMainViewPresenter(IExecutor executor, IMainView view) {
        super(view);
        mExecutor = executor;
    }

    @Override
    protected void setViewInterface(IMainView view) {
        view.setPresenterInterface(this);
    }

    @Override
    public void onViewShown() {
        //getView().showProgress();
        //mExecutor.execute(new SomeInteractor(new InteractorCallback() {...}));
    }

    @Override
    public void onViewRemoved() {

    }
}
