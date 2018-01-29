package com.behavioraldesignpatterns.observer;

import java.util.LinkedList;
import java.util.List;

public class RedDress implements Observable {

    private List<Observer> observerList = new LinkedList<>();
    private Boolean inStock = false;

    public Boolean getInStock() {
        return inStock;
    }
    //any change in inStock will happen thrg setter
    public void setInStock(Boolean inStock) {
        this.inStock = inStock;
        notifyUser();
    }

    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }
    public void notifyUser() {
        observerList.forEach(observer -> observer.sendEmail());
    }
}
