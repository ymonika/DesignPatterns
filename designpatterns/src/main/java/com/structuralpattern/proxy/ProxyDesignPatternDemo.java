package com.structuralpattern.proxy;

public class ProxyDesignPatternDemo {

    public static void main(String[] args) {
        ProxyImage proxyImage = new ProxyImage("c://image.png");
        proxyImage.load();

        ProxyImage proxyImage1 = new ProxyImage("c://image1.png");
        proxyImage1.load();

        proxyImage.load();
        proxyImage.load();

    }
}
