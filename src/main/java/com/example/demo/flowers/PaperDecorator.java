package com.example.demo.flowers;

public class PaperDecorator extends ItemDecorator {
    public PaperDecorator(Item item) {
        super(item);
    }

    public double getPrice() {
        return super.getPrice() + 20;
    }
}
