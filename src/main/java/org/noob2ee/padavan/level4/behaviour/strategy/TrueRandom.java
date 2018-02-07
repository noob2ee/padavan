package org.noob2ee.padavan.level4.behaviour.strategy;

import java.util.Random;

public class TrueRandom implements Strategy {

    private Random random = new Random();

    @Override
    public int findRandom(int range) {
        return random.nextInt(range);
    }
}
