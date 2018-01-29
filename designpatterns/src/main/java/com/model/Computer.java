package com.model;

public abstract class Computer {

    public abstract String getRam();
    public abstract String getHdd();
    public abstract String getCpu();

    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }

    public void setGraphicsCardEnabled(boolean graphicsCardEnabled) {
        isGraphicsCardEnabled = graphicsCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    public void setBluetoothEnabled(boolean bluetoothEnabled) {
        isBluetoothEnabled = bluetoothEnabled;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "ram='" + getRam() + '\'' +
                ", hdd='" + getHdd() + '\'' +
                ", cpu='" + getCpu() + '\'' +
                '}';
    }
}
