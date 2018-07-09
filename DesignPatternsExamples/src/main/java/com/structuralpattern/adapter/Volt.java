package com.structuralpattern.adapter;

public class Volt {

    private int volt;

    public Volt(int volt) {
        this.volt = volt;
    }

    public int getVolt() {
        return volt;
    }

    public void setVolt(int volt) {
        this.volt = volt;
    }

    @Override
    public String toString() {
        return "Volt{" +
                "volt=" + volt +
                '}';
    }
}
