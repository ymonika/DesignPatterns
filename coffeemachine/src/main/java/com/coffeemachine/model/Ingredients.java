package com.coffeemachine.model;

public class Ingredients {

    private Type ingredient;
    private int units;
    private int perUnitPrice;

    public Ingredients() {
    }

    public Ingredients(Type ingredient, int units, int perUnitPrice) {
        this.ingredient = ingredient;
        this.perUnitPrice = perUnitPrice;
        this.units = units;
    }
    public int getUnits(){
        return this.units;
    }
    public int getPerUnitPrice() {
        return this.perUnitPrice;
    }

    public Type getIngredient() {
        return ingredient;
    }

    public enum Type{
        COFFEE,MILK,SUGAR;
    }
}
