package com.example.demo.payment;

public class CreditCardPaymentStrategy implements Payment {

    @Override
    public String pay(float price) {
        return "Pay " + price + " (credit card)";
    }
}
