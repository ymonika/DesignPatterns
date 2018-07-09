package com.structuralpattern.bridge;

public class RedCircle implements DrawAPI {

    public void drawCircle(int radius, int x, int y) {
        System.out.println("Red Circle: [radius:" + radius + " x:" + x + " y:" + y + "]");
    }
}
