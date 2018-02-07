package org.noob2ee.padavan.level4.behaviour.observer;

public class Singer1 implements Observer {

    private String currentSong;

    public void singing() {
        System.out.println("I'm singin a song: '" + currentSong + "' ...");
    }


    @Override
    public void update(String song) {
        currentSong = song;
    }
}
