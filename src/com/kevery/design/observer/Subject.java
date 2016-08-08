package com.kevery.design.observer;

/**
 * Created by kever
 * 16/7/28.
 */
public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();

}
