package boulderstudios.com.boilerplate;

import android.support.annotation.CallSuper;

import org.junit.Before;

/**
 * Created by yuval on 1/27/18.
 */

public abstract class BaseTestCase<T> {

    @Before
    @CallSuper
    public void setup() {
    }

    public abstract T getConcreteUUT();
}
