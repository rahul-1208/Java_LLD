package org.example.State;

public class OutOfStockState implements VendingMachineState{
    @Override
    public void insertMoney(VendingMachine vendingMachine) {
        System.out.println("Cannot insert Money as the machine is out of stock");
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine) {
        System.out.println("Cannot select product as the machine is out of stock");
    }

    @Override
    public void dispense(VendingMachine vendingMachine) {
        System.out.println("Cannot dispense as the machine is out of stock");
    }
}
