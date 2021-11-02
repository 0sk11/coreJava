package com.company;

import java.util.LinkedList;

public abstract class DessertItem {
    private int tax;
    private LinkedList<Integer> items;
    public abstract int getCost();
    public abstract void owner();
    public abstract int customer(int item);

    public void setItems(int item) {
        items.push(item);
    }
    public int getPrice(){
        return 1;
    }
    public int getItem(){
        if(items.isEmpty()) return 0;
        int x = items.get(0);
        items.removeFirst();
        return x;

    }
}
