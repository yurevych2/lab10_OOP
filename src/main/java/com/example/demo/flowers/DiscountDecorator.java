package com.example.demo.flowers;

public class DiscountDecorator extends ItemDecorator {
    public DiscountDecorator(Item item) {
        super(item);
    }

    public double getPrice() {
        return super.getPrice() * 0.8;
    }
}
