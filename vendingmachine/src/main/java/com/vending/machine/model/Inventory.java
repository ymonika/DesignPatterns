package com.vending.machine.model;

public class Inventory {

    private CommonInventory itemInventory;
    private CommonInventory coinInventory;

    private Item selectedItem;
    private Coin coinsAddedByUser;

    public Inventory() {
        this.itemInventory = new CommonInventory<Item>();
        this.coinInventory = new CommonInventory<Coin>();
    }

    public Item getSelectedItem() {
        return selectedItem;
    }

    public void setSelectedItem(Item selectedItem) {
        this.selectedItem = selectedItem;
    }

    public Coin getCoinsAddedByUser() {
        return coinsAddedByUser;
    }

    public void setCoinsAddedByUser(Coin coinsAddedByUser) {
        this.coinsAddedByUser = coinsAddedByUser;
    }

    public void setConfirmation(String confirmation) {
        if(confirmation == "y"){
            itemInventory.removeInventoryFromExistingMap(selectedItem);
            coinInventory.addInventoryToExistingMap(coinsAddedByUser);
        } else {
            selectedItem = null;
            coinsAddedByUser = null;
        }
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "itemInventory=" + itemInventory +
                ", coinInventory=" + coinInventory +
                ", selectedItem=" + selectedItem +
                ", coinsAddedByUser=" + coinsAddedByUser +
                '}';
    }
}
