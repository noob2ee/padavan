package org.noob2ee.padavan.level4.creational.singleton;

public class InnerSingleton {
    private static InnerSingleton instance = null;

    private InnerSingleton() {
    }

    private static class InnerSingletonHolder {
        public static InnerSingleton instance = new InnerSingleton();
    }

    public static InnerSingleton getInstance() {
        return InnerSingletonHolder.instance;
    }

}
