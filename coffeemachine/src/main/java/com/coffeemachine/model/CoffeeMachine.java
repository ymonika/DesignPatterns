package com.coffeemachine.model;

public class CoffeeMachine {

    private Ingredients coffeeIngredients = new Ingredients(Ingredients.Type.COFFEE, 100, 75);
    private Ingredients milkIngredients = new Ingredients(Ingredients.Type.MILK, 50, 25);
    private Ingredients sugarIngredients = new Ingredients(Ingredients.Type.SUGAR, 50, 25);
    private MyCoffee myCoffee;

    public CoffeeMachine() {
        this.myCoffee = new MyCoffee();
    }

    public MyCoffee getMyCoffee() {
        return myCoffee;
    }

    public void setMyCoffee(MyCoffee myCoffee) {
        this.myCoffee = myCoffee;
    }

    public Ingredients getCoffeeIngredients() {
        return coffeeIngredients;
    }

    public void setCoffeeIngredients(Ingredients coffeeIngredients) {
        this.coffeeIngredients = coffeeIngredients;
    }

    public Ingredients getMilkIngredients() {
        return milkIngredients;
    }

    public void setMilkIngredients(Ingredients milkIngredients) {
        this.milkIngredients = milkIngredients;
    }

    public Ingredients getSugarIngredients() {
        return sugarIngredients;
    }

    public void setSugarIngredients(Ingredients sugarIngredients) {
        this.sugarIngredients = sugarIngredients;
    }

    @Override
    public String toString() {
        return "CoffeeMachine{" +
                "coffeeIngredients=" + coffeeIngredients +
                ", milkIngredients=" + milkIngredients +
                ", sugarIngredients=" + sugarIngredients +
                ", myCoffee=" + myCoffee +
                '}';
    }
}
