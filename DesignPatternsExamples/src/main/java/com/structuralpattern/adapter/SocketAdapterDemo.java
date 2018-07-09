package com.structuralpattern.adapter;

public class SocketAdapterDemo {

    public static void main(String[] args) {
        SocketAdapter socketAdapter = new SocketAdapterImpl();
        System.out.println(socketAdapter.get3Volt());
        System.out.println(socketAdapter.get12Volt());
        System.out.println(socketAdapter.get120Volt());
    }
}
