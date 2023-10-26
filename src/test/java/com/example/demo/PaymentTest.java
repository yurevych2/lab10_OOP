package com.example.demo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.example.demo.payment.CreditCardPaymentStrategy;
import com.example.demo.payment.PayPalPaymentStrategy;
import com.example.demo.payment.Payment;

public class PaymentTest {
    @Test
    public void testPayPalPayment() {
        Payment payment = new PayPalPaymentStrategy();
        Assertions.assertEquals("Pay 2.0 (PayPal)", payment.pay(2));
    }

    @Test
    public void testCreditCardPayment() {
        Payment payment = new CreditCardPaymentStrategy();
        Assertions.assertEquals(
                "Pay 2.0 (credit card)",
                payment.pay(2)
        );
    }
}
