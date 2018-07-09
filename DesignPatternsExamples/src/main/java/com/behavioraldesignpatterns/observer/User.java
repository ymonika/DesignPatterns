package com.behavioraldesignpatterns.observer;

public class User implements Observer {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public void sendMsg() {
        System.out.println("Hi, " + name + " dress is available: =>");
    }
}
