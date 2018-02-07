package org.noob2ee.padavan.creational.factory;

import org.junit.Test;
import org.noob2ee.padavan.level4.creational.factory.*;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.assertThat;

public class ConnectionFactoryTest {
    @Test
    public void ok() {
        List<ConnectionFactory> list = new ArrayList<>();
        list.add(new SimpleConnectionFactory());
        list.add(new PooledConnectionFactory());
        ConnectionFactory factory1 = list.get(0);
        Connection connection1 = factory1.createConnection();
        assertThat(connection1, instanceOf(SimpleConnection.class));
        ConnectionFactory factory2 = list.get(1);
        Connection connection2 = factory2.createConnection();
        assertThat(connection2, instanceOf(PooledConnection.class));
    }
}