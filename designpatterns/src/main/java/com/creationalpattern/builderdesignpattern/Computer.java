package com.creationalpattern.builderdesignpattern;

public class Computer {

    private String ram;
    private String hdd;
    private String cpu;

    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

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
                "ram='" + ram + '\'' +
                ", hdd='" + hdd + '\'' +
                ", cpu='" + cpu + '\'' +
                ", isGraphicsCardEnabled=" + isGraphicsCardEnabled +
                ", isBluetoothEnabled=" + isBluetoothEnabled +
                '}';
    }

    private Computer(ComputerBuilder computerBuilder) {
        this.cpu = computerBuilder.cpu;
        this.ram = computerBuilder.ram;
        this.hdd = computerBuilder.hdd;
        this.isGraphicsCardEnabled = computerBuilder.isGraphicsCardEnabled;
        this.isBluetoothEnabled = computerBuilder.isBluetoothEnabled;
    }

    public static class ComputerBuilder {

        //required
        private String ram;
        private String hdd;
        private String cpu;

        //optional
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;

        public ComputerBuilder(String ram, String hdd, String cpu){
            this.ram = ram;
            this.hdd = hdd;
            this.cpu = cpu;
        }

        public ComputerBuilder withGraphicsCardEnabled() {
            this.isGraphicsCardEnabled =  true;
            return this;
        }

        public ComputerBuilder withBluetoothEnabled() {
            this.isBluetoothEnabled = true;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }

    public static void main(String[] args) {
        Computer computer = new ComputerBuilder("1", "512", "4core").withBluetoothEnabled().build();
        System.out.println(computer);
    }

}
