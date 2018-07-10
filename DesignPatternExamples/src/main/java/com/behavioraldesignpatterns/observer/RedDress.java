package com.behavioraldesignpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class RedDress implements Observable {

    private List<Observer> observerList =  new ArrayList<>();
    private boolean available;

    public RedDress() {

    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
        notifyObserver();
    }

    public void notifyObserver() {
        observerList.forEach(consumer -> consumer.sendMsg());
    }

    public void removeObserver(Observer o) {
        observerList.remove(o);
    }

    public void addObserver(Observer o) {
        observerList.add(o);
    }

}
