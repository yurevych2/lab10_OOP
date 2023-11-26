package com.example.demo.order;
import java.util.List;
import com.example.demo.delivery.Delivery;
import com.example.demo.flowers.Item;
import com.example.demo.payment.Payment;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Order {
    private List<Item> items;
    private Payment payment;
    private Delivery delivery;
    @Getter
    private float price;

    public void setPaymentStrategy(Payment paymentMethod) {
        this.payment = paymentMethod;
    }

    public void setDeliveryStrategy(Delivery deliveryMethod) {
        this.delivery = deliveryMethod;
    }

    void calculateTotalPrice() {
        float totalPrice = 0;

        for (Item item : items) {
            totalPrice += item.getPrice();
        }

        this.price = totalPrice;
    }

    void addItem(Item item) {
        items.add(item);

        calculateTotalPrice();
    }

    void removeItem(Item item) {
        items.remove(item);

        calculateTotalPrice();
    }

    void processOrder() {
        System.out.printf("You ordered " + items.size() + " items\n");
        System.out.printf("You have chosen " 
            + payment.getClass().getSimpleName() + " payment strategy");
        System.out.printf("You choose " + delivery.getClass().getSimpleName()
            + " delivery strategy");
        System.out.printf("Total price is " + price);
    }
}