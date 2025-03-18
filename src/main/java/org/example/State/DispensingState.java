package org.example.State;

public class DispensingState implements VendingMachineState{
    @Override
    public void insertMoney(VendingMachine vendingMachine) {
        System.out.println("Money already inserted");
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine) {
        System.out.println("Product is already selected");
    }

    @Override
    public void dispense(VendingMachine vendingMachine) {
        System.out.println("Product is Dispensed!!");
        if(vendingMachine.getStock()>0){
            vendingMachine.setState(new IdleState());
        }else{
            vendingMachine.setState(new OutOfStockState());
        }

    }
}
