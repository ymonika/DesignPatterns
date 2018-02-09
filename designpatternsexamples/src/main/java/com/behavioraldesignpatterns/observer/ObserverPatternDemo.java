package com.behavioraldesignpatterns.observer;

public class ObserverPatternDemo {

    public static void main(String[] args) {
        RedDress redDress = new RedDress();
        User u4 = new User("User4");
        redDress.addObserver(new User("User1"));
        redDress.addObserver(new User("User2"));
        redDress.addObserver(new User("User3"));
        redDress.setAvailable(true);
    }
}
