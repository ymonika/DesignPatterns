package com.coffeemachine.service;

public interface CoffeeMachineFunction {

    void addIngredients(int coffee, int milk, int sugar);
    int calculatePrice();
    void pressOk();
    void resetAll();
    void quit();

}
