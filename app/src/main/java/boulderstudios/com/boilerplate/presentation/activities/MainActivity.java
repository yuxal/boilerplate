package boulderstudios.com.boilerplate.presentation.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import boulderstudios.com.boilerplate.R;
import boulderstudios.com.boilerplate.domain.executor.impl.BackgroundThreadExecutor;
import boulderstudios.com.boilerplate.presentation.mvpviewinterfaces.IMainView;
import boulderstudios.com.boilerplate.presentation.presenters.DefaultMainViewPresenter;

public class MainActivity extends AppCompatActivity implements IMainView {

    private PresenterInterface mPresenterInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new DefaultMainViewPresenter(BackgroundThreadExecutor.getInstance(), this);
    }

    @Override
    public void setPresenterInterface(PresenterInterface presenterInterface) {
        mPresenterInterface = presenterInterface;
    }

    @Override
    protected void onResume() {
        super.onResume();
        mPresenterInterface.onViewShown();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mPresenterInterface.onViewRemoved();
    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }
}

