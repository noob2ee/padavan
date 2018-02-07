package org.noob2ee.padavan.creational.factory;

import org.junit.Test;
import org.noob2ee.padavan.level4.creational.factory.Connection;
import org.noob2ee.padavan.level4.creational.factory.ConnectionObjectFactory;
import org.noob2ee.padavan.level4.creational.factory.PooledConnection;
import org.noob2ee.padavan.level4.creational.factory.SimpleConnection;

import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class ConnectionObjectFactoryTest {

    private ConnectionObjectFactory factory = new ConnectionObjectFactory();

    @Test
    public void ok() {
        Connection simple = factory.createConnection("simple");
        assertThat(simple, instanceOf(SimpleConnection.class));
        Connection pooled = factory.createConnection("pooled");
        assertThat(pooled, instanceOf(PooledConnection.class));
    }

    @Test(expected = RuntimeException.class)
    public void throwsRuntimeExceptionForInvalidConnectionType() throws Exception {
        Connection simple = factory.createConnection("bad");
        fail("must not reach it");
    }

}