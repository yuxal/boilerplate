package boulderstudios.com.boilerplate.presentation.mvpviewinterfaces;

import boulderstudios.com.boilerplate.presentation.IMvpView;
import boulderstudios.com.boilerplate.presentation.IPresenterInterface;

/**
 * Created by yuval on 2/24/18.
 */

public interface IMainView extends IMvpView<IMainView.PresenterInterface> {

    interface PresenterInterface extends IPresenterInterface {

    }
}
