package com.example.demo.delivery;
import java.util.List;
import com.example.demo.flowers.Item;

public class DHLDeliveryStrategy implements Delivery {
    @Override
    public String deliver(List<Item> items) {
        return "Delivery by DHL of: " + items;
    }
}
