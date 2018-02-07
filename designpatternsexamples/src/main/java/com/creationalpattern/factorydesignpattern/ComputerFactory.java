package com.creationalpattern.factorydesignpattern;

import com.model.Computer;
import com.model.PC;
import com.model.Server;

public class ComputerFactory {

    public Computer getComputer(String type, String ram, String hdd, String cpu) {
        Computer computer;
        if(type.equalsIgnoreCase("Server")) {
            computer = new Server(ram, hdd, cpu);
        } else {
            computer = new PC(ram, hdd, cpu);
        }
        return computer;
    }

}
