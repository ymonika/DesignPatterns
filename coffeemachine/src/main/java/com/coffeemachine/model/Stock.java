package com.coffeemachine.model;

public class Stock<T> {

    private int units;
    private Ingredients ingredient;

    public Stock() {
    }

    public boolean checkForInStock(int units) {
        return this.units >= units ? true : false ;
    }

    public void setUnits() {
        this.units = units;
    }

    public int getUnits() {
        return units;
    }

    public static void main(String[] args) {
        //Ingredients coffee = Ingredients.COFFEE;
        Stock coffeeStock = new Stock<Ingredients>();
    }

}
