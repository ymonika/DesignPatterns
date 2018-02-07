package com.creationalpattern.abstractfactorydesignpattern;

import com.model.Computer;

public class ComputerFactory {

    public static Computer getComputer(ComputerAbstractFactory computerAbstractFactory){
        return computerAbstractFactory.createComputer();
    }

    /* Testing
        ComputerFactory.getComputer(new PCComputerFactory("1","512","4"));
        ComputerFactory.getComputer(new ServerComputerFactory("50","2048","8"));
     */
}
