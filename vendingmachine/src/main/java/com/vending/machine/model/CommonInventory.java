package com.vending.machine.model;

import java.util.HashMap;
import java.util.Map;

public class CommonInventory<T> {

    private Map<T, Integer> inventory;

    public CommonInventory() {
        inventory = new HashMap<>();
    }

    public Map<T, Integer> getInventory() {
        return inventory;
    }

    public void setInventory(Map<T, Integer> inventory) {
        this.inventory = inventory;
    }

    public void addInventoryToExistingMap(T t) {
        int count = inventory.get(t) == null ? 0 : inventory.get(t);
        inventory.put(t, ++count);
    }
    public void removeInventoryFromExistingMap(T t) {
        int count = inventory.get(t) == null ? 0 : inventory.get(t);
        inventory.put(t, --count);
    }

    @Override
    public String toString() {
        return "CommonInventory{" +
                "inventory=" + inventory +
                '}';
    }
}
