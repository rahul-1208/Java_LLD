package org.example.Strategy;

public class CreditCardPaymentStrategy implements PaymentStrategy{
    @Override
    public void pay() {
        System.out.println("Paying through Credit Card");
    }
}
