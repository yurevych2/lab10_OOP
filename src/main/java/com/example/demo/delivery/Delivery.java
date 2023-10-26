package com.example.demo.delivery;
import java.util.List;
import com.example.demo.flowers.Item;

public interface Delivery {
    String deliver(List<Item> items);
}
