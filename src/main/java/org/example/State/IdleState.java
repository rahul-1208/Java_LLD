package org.example.State;

public class IdleState implements VendingMachineState{


    @Override
    public void insertMoney(VendingMachine vendingMachine) {
        System.out.println("Money Inserted");
        vendingMachine.setState(new MoneyInsertedState());
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine) {
        System.out.println("Please insert Money first");
    }

    @Override
    public void dispense(VendingMachine vendingMachine) {
        System.out.println("Please insert Money first");
    }
}
