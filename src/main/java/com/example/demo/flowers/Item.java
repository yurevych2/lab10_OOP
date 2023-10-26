package com.example.demo.flowers;
import lombok.Getter;
import lombok.ToString;

@Getter @ToString
public abstract class Item {
    private String description;
    public abstract double getPrice();
}
