package org.noob2ee.padavan.level4.creational.factory;

public class PooledConnectionFactory extends ConnectionFactory {
    @Override
    public Connection createConnection() {
        return new PooledConnection();
    }
}
