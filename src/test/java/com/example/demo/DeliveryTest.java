package com.example.demo;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.example.demo.delivery.DHLDeliveryStrategy;
import com.example.demo.delivery.Delivery;
import com.example.demo.delivery.PostDeliveryStrategy;
import com.example.demo.flowers.Flower;
import com.example.demo.flowers.Item;

public class DeliveryTest {
    private List<Item> items;

    @Test
    public void testDHLDelivery() {
        Delivery delivery = new DHLDeliveryStrategy();
        Assertions.assertEquals("Delivery by DHL of: null",
            delivery.deliver(items));
    }

    @Test
    public void testPostDelivery() {
        Delivery delivery = new PostDeliveryStrategy();
        Assertions.assertEquals("Delivering by post such items: null",
            delivery.deliver(items));
    }
}
