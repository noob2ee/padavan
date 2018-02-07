package org.noob2ee.padavan.level4.behaviour.observer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Radio implements Observable {
    private List<Observer> observers = new ArrayList<>();
    private List<String> songs = Arrays.asList("song1", "song2", "song3");
    private String currentSong;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(currentSong);
        }
    }

    public String changeRandomSong() {
        Random random = new Random();
        int i = random.nextInt(songs.size());
        currentSong = songs.get(i);
        notifyObservers();
        return currentSong;
    }

}
