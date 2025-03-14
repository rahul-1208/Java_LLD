package org.example.AbstractFactory;

public class SUVCar implements Car{
    @Override
    public void drive() {
        System.out.println("driving SUV car");
    }

    @Override
    public String price() {
        return "15000";
    }
}
