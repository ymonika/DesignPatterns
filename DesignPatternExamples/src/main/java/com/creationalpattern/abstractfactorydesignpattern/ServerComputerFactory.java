package com.creationalpattern.abstractfactorydesignpattern;

import com.model.Computer;
import com.model.Server;

public class ServerComputerFactory extends ComputerAbstractFactory {

    private String ram;
    private String hdd;
    private String cpu;

    public ServerComputerFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    public Computer createComputer(){
        return new Server(ram,hdd,cpu);
    }
}
