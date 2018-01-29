package com.vending.machine.services;

import com.vending.machine.model.Coin;
import com.vending.machine.model.Item;

import java.util.Arrays;
import java.util.List;

public class VendingMachineRunner {

    public static void main(String[] args) {

        List<Coin> coins = Arrays.asList(Coin.QUARTER);

        VendingMachineFunctionImpl vendingMachineFunction = new VendingMachineFunctionImpl();
        vendingMachineFunction.getCoins(coins);
        vendingMachineFunction.selectItem(Item.COKE);
        vendingMachineFunction.confirmation("y");
        vendingMachineFunction.selectItem(Item.PEPSI);
        vendingMachineFunction.confirmation("y");
        System.out.println(vendingMachineFunction.getInventory());
        System.out.println(vendingMachineFunction.returnItem());

    }
}
