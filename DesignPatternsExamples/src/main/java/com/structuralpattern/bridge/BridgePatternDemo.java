package com.structuralpattern.bridge;

public class BridgePatternDemo {

    public static void main(String[] args) {
        Shape redCircle = new Circle(5,5,5, new RedCircle());
        Shape greenCircle = new Circle(5,5,5, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
