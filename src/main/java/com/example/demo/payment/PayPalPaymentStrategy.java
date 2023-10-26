package com.example.demo.payment;

public class PayPalPaymentStrategy implements Payment {

    @Override
    public String pay(float price) {
        return "Pay " + price + " (PayPal)";
    }
}
