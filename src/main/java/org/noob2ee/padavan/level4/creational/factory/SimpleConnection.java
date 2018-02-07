package org.noob2ee.padavan.level4.creational.factory;

public class SimpleConnection extends Connection {
    @Override
    public void openConnection() {
        System.out.println("open simple connection...");
    }
}
