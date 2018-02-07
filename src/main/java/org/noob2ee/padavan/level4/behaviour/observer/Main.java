package org.noob2ee.padavan.level4.behaviour.observer;

public class Main {
    public static void main(String[] args) {
        Radio radio = new Radio();

        Listener1 listener1 = new Listener1();
        Singer1 singer1 = new Singer1();

        radio.registerObserver(listener1);
        radio.registerObserver(singer1);

        listener1.listening();
        singer1.singing();

        radio.changeRandomSong();
        listener1.listening();
        singer1.singing();

        radio.changeRandomSong();
        listener1.listening();
        singer1.singing();

        radio.changeRandomSong();
        listener1.listening();
        singer1.singing();

    }
}
