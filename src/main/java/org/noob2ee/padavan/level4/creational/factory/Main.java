package org.noob2ee.padavan.level4.creational.factory;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<ConnectionFactory> list = new ArrayList<>();
        list.add(new SimpleConnectionFactory());
        list.add(new PooledConnectionFactory());
        for (ConnectionFactory factory : list) {
            Connection connection = factory.createConnection();
            connection.openConnection();
        }

        ConnectionObjectFactory factory = new ConnectionObjectFactory();
        Connection connection = factory.createConnection("simple");
        connection.openConnection();
    }
}
