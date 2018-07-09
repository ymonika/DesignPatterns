package com.structuralpattern.adapter;

public class SocketAdapterImpl implements SocketAdapter {

    private Socket socket;

    public SocketAdapterImpl() {
        this.socket = new Socket();
    }

    @Override
    public Volt get120Volt() {
        return convertVolt(socket.getVolt(), 1);
    }

    @Override
    public Volt get3Volt() {
        return convertVolt(socket.getVolt(), 40);
    }

    @Override
    public Volt get12Volt() {
        return convertVolt(socket.getVolt(), 10);
    }

    private Volt convertVolt(Volt volt, int divisor) {
        return new Volt(volt.getVolt()/divisor);
    }
}
