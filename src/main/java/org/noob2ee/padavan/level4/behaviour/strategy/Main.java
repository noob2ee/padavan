package org.noob2ee.padavan.level4.behaviour.strategy;

public class Main {

    public static void main(String[] args) {

        Strategy fakeStrategy = new FakeRandom();
        Strategy trueStrategy = new TrueRandom();
        IqTester tester = new IqTester();
        tester.setIqStrategy(fakeStrategy);
        System.out.println("your IQ is:" + tester.getMyIq());
        tester.setIqStrategy(trueStrategy);
        System.out.println("your IQ is:" + tester.getMyIq());
    }
}
