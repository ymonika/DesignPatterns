package com.vending.machine.services;

import com.vending.machine.interfaces.VendingMachineFunction;
import com.vending.machine.model.Coin;
import com.vending.machine.model.Inventory;
import com.vending.machine.model.Item;

import java.util.List;

public class VendingMachineFunctionImpl implements VendingMachineFunction {

    private Inventory inventory;

    public VendingMachineFunctionImpl() {
        inventory = new Inventory();
    }

    public void getCoins(List<Coin> coins) {
        inventory.setCoinsAddedByUser(coins.get(0));
    }

    public Item returnItem() {
        return inventory.getSelectedItem();
    }

    public void selectItem(Item item) {
        if (inventory.getCoinsAddedByUser().getValue() == item.getValue())
            inventory.setSelectedItem(item);
    }

    public void confirmation(String confirmation) {
        inventory.setConfirmation(confirmation);
    }

    public Inventory getInventory() {
        return inventory;
    }
}
