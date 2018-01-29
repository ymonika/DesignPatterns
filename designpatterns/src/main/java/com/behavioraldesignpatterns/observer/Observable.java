package com.behavioraldesignpatterns.observer;

public interface Observable {

    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyUser();

}
