package com.behavioraldesignpatterns.observer;

public interface Observable {

    void notifyObserver();
    void removeObserver(Observer o);
    void addObserver(Observer o);
}
