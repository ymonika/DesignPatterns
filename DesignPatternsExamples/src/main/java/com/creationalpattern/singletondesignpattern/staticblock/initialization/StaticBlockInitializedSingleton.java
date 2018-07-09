package com.creationalpattern.singletondesignpattern.staticblock.initialization;

public class StaticBlockInitializedSingleton {

    private static StaticBlockInitializedSingleton instance;

    static {
        try {
            instance = new StaticBlockInitializedSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred while creating singleton instance");
        }
    }

    private StaticBlockInitializedSingleton(){
    }

    public static StaticBlockInitializedSingleton getInstance() {
        return  instance;
    }

}
