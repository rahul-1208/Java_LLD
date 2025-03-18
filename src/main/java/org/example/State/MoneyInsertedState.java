package org.example.State;

public class MoneyInsertedState implements VendingMachineState{
    @Override
    public void insertMoney(VendingMachine vendingMachine) {
        System.out.println("Money already inserted");
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine) {
        System.out.println("Proceed to dispensing!!");
        vendingMachine.setState(new DispensingState());
    }

    @Override
    public void dispense(VendingMachine vendingMachine) {
        System.out.println("Select the product first");
    }
}
