package org.example.State;

public class VendingMachine {

    private VendingMachineState vendingMachineState;

    public int getStock() {
        return stock;
    }

    private int stock = 2;

    public VendingMachine(){
       vendingMachineState = new IdleState();
    }

    public void setState(VendingMachineState state){
        this.vendingMachineState = state;
    }

    public void insertMoney(){
        vendingMachineState.insertMoney(this);
    }

    public void makeSelection(){
        vendingMachineState.selectProduct(this);
    }

    public void dispenseItem(){
        if(stock>0){
            vendingMachineState.dispense(this);
            stock--;
            if(stock==0){
                setState(new OutOfStockState());
            }
        }else{
            setState(new OutOfStockState());
            vendingMachineState.dispense(this);
        }
    }


}
