package org.noob2ee.padavan.level4.creational.singleton;

public class DoubleCheckedSingleton {

    private static volatile DoubleCheckedSingleton instance = null;

    private DoubleCheckedSingleton() {
    }

    public static DoubleCheckedSingleton getInstance() {
        DoubleCheckedSingleton localInstance = instance;
        if (localInstance == null) {
            synchronized (DoubleCheckedSingleton.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new DoubleCheckedSingleton();
                }
            }
        }
        return localInstance;
    }
}
