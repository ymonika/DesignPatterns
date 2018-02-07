package com.structuralpattern.proxy;

public class ProxyImage implements Image {

    private String imageName;
    private RealImage realImage;

    public ProxyImage(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public void load(){
        if(realImage == null) {
            realImage = new RealImage(imageName);
        }
        realImage.load();
    }
}
