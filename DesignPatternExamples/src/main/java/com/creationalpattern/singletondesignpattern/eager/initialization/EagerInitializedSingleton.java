package com.creationalpattern.singletondesignpattern.eager.initialization;

public class EagerInitializedSingleton {

    private static EagerInitializedSingleton instance = new EagerInitializedSingleton();

    private EagerInitializedSingleton() {
    }

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }
}
