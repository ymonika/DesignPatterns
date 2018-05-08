package com.creationalpattern.singletondesignpattern.serialization;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {
    private static final long serialVersionID = -7604766932017737115L;

    private SerializedSingleton() {
    }

    public static SerializedSingleton getInstance() {
        return SingletonHelper.instance;
    }

    /*protected Object readResolve() {
        return getInstance();
    }*/

    private static class SingletonHelper {
        private static SerializedSingleton instance = new SerializedSingleton();
    }

}
