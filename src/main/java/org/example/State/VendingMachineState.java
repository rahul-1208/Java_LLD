package org.example.State;

public interface VendingMachineState {
    void insertMoney(VendingMachine vendingMachine);
    void selectProduct(VendingMachine vendingMachine);
    void dispense(VendingMachine vendingMachine);
}
