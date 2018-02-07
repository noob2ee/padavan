package org.noob2ee.padavan.level4.creational.factory;

public class SimpleConnectionFactory extends ConnectionFactory {
    @Override
    public Connection createConnection() {
        return new SimpleConnection();
    }
}
