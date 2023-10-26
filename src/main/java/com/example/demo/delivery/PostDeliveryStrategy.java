package com.example.demo.delivery;
import java.util.List;
import com.example.demo.flowers.Item;

public class PostDeliveryStrategy implements Delivery {
    @Override
    public String deliver(List<Item> items) {
        return "Delivering by post such items: " + items;
    }
}
