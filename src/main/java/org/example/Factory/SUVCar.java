package org.example.Factory;

public class SUVCar implements Car{
    @Override
    public void drive() {
        System.out.println("Driving SUV car");
    }

    @Override
    public String getPrice() {
        return "15000";
    }
}
