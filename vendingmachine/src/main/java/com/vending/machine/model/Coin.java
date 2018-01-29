package com.vending.machine.model;

public enum Coin {
    PENNY(1),DIME(5),NICKEL(10),QUARTER(25);
    int value;

    Coin(int value) {
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }
}
