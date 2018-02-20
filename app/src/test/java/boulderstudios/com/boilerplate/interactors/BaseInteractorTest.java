package boulderstudios.com.boilerplate.interactors;

import org.junit.Before;

import boulderstudios.com.boilerplate.BaseTestCase;

/**
 * Created by yuval on 1/25/18.
 */

public abstract class BaseInteractorTest<T> extends BaseTestCase<T> {

    @Before
    @Override
    public void setup() {
        super.setup();
    }
}
