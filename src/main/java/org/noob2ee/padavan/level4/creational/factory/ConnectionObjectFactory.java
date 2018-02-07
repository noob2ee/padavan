package org.noob2ee.padavan.level4.creational.factory;

public class ConnectionObjectFactory {

    public Connection createConnection(String type) {
        if (type.equals("simple")) {
            return new SimpleConnection();
        } else if (type.equals("pooled")) {
            return new PooledConnection();
        } else {
            throw new RuntimeException("unsupported connection type");
        }
    }
}
