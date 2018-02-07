package org.noob2ee.padavan.level4.behaviour.strategy;

public class IqTester {

    private final int range = 100;
    private Strategy iqStrategy;

    public IqTester() {
    }

    public void setIqStrategy(Strategy strategy) {
        iqStrategy = strategy;
    }

    int getMyIq() {
        return iqStrategy.findRandom(100);
    }
}
