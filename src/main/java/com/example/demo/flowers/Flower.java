package com.example.demo.flowers;
// import jakarta.persistence.Entity;
// import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor @NoArgsConstructor @Getter @Setter @ToString
// @Entity
public class Flower {
    // @Id
    // private int id;
    private double sepalLength;
    private int color;
    // 
    private double price;
    private int flowerType;
    // 

    public Flower(Flower flower) {
        this.color = flower.color;
        this.price = flower.price;
        this.sepalLength = flower.sepalLength;
        this.flowerType = flower.flowerType;
    }

}
