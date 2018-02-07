package org.noob2ee.padavan.level4.behaviour.strategy;

public class FakeRandom implements Strategy {
    @Override
    public int findRandom(int range) {
        return range / 2;
    }
}
