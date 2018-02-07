package org.noob2ee.padavan.level3.counter;

public class CounterThreadSync implements Runnable {
    private final Counter counter;
    private final int clickNumber;

    public CounterThreadSync(Counter counter, int clickNumber) {
        this.counter = counter;
        this.clickNumber = clickNumber;
    }

    @Override
    public void run() {
        synchronized (counter) {
            while (counter.count < clickNumber) {
                System.err.println("Thread (1): " + Thread.currentThread().getName());
                sleep(10);
                counter.inc();
                System.err.println("Thread (2): " + Thread.currentThread().getName());
                sleep(100);
            }
        }
    }

    private void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}