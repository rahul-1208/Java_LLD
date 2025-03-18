package org.example.Strategy;

public class PaypalPaymentStrategy implements PaymentStrategy{
    @Override
    public void pay() {
        System.out.println("Paying through Paypal");
    }
}
