package org.noob2ee.padavan.level4.behaviour.observer;

public class Listener1 implements Observer {

    private String currentSong;

    public void listening() {
        System.out.println("I'm singing a song: '" + currentSong + "' ...");
    }


    @Override
    public void update(String song) {
        currentSong = song;
    }
}
