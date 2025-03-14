package org.example.AbstractFactory;

public class SedanCar implements Car{
    @Override
    public void drive() {
        System.out.println("Driving Sedan Car");
    }

    @Override
    public String price() {
        return "10000";
    }
}
