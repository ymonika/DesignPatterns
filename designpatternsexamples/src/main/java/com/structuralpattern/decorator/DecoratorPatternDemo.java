package com.structuralpattern.decorator;

public class DecoratorPatternDemo {

    public static void main(String[] args) {
        Car luxuryCar = new LuxuryCar(new BasicCar());
        luxuryCar.assemble();

        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
    }
}
