package com.company;

public class IceCream extends DessertItem{
    private int total;
    @Override
    public int getCost() {
        total = getPrice()*getItem();
        return total;
    }

    @Override
    public void owner() {
        setItems(60);
    }

    @Override
    public int customer(int item) {
        return getCost()*item;
    }
}
