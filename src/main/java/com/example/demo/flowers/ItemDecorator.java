package com.example.demo.flowers;

public class ItemDecorator {
    private Item item;

    public ItemDecorator(Item item) {
        this.item = item;
    }

    public String getDescription() {
        return item.getDescription();
    }

    public double getPrice() {
        return item.getPrice();
    }
}
