package com.creationalpattern.abstractfactorydesignpattern;

import com.model.Computer;
import com.model.PC;

public class PCComputerFactory extends ComputerAbstractFactory {

    private String ram;
    private String hdd;
    private String cpu;

    public PCComputerFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    public Computer createComputer(){
        return new PC(ram,hdd,cpu);
    }
}
