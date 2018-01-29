package com.vending.machine.interfaces;

import com.vending.machine.model.Coin;
import com.vending.machine.model.Item;

import java.util.List;

public interface VendingMachineFunction {

    void getCoins(List<Coin> coins);
    Item returnItem();
    void selectItem(Item item);
}
