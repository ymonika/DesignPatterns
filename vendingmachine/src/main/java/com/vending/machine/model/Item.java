package com.vending.machine.model;

public enum Item {
    COKE(25), PEPSI(25), SODA(25);
    int value;

    Item(int value) {
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }
}
