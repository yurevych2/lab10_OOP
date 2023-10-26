package com.example.demo.flowers;
import com.fasterxml.jackson.annotation.JsonValue;

public enum FlowerColor {
    RED("red"), BLUE("blue");
    // private final String stringRepresentation;

    private String value;

    FlowerColor(String value) {
        this.value = value;
    }
    
    @JsonValue
    public String toString() {
        return value;
    }
}
