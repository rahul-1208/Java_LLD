package org.example.Strategy;

public class GooglePayPaymentStrategy implements PaymentStrategy{
    @Override
    public void pay() {
        System.out.println("Paying through Google Pay");
    }
}
