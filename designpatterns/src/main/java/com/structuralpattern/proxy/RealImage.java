package com.structuralpattern.proxy;

public class RealImage implements Image{

    private String imageName;

    public RealImage(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public void load() {
        System.out.println("loading image: " + imageName);
    }
}
