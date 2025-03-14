package org.example.Factory;

public class SedanCar implements Car{

    @Override
    public void drive() {
        System.out.println("Driving Sedan Car");
    }

    @Override
    public String getPrice() {
        return "10000";
    }
}
