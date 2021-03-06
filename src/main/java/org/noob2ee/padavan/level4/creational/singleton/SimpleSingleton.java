package org.noob2ee.padavan.level4.creational.singleton;

public class SimpleSingleton {

    private static SimpleSingleton instance = null;

    private SimpleSingleton() {
    }

    public static SimpleSingleton getInstance() {
        if (instance == null) {
            instance = new SimpleSingleton();
        }
        return instance;
    }
}
