package org.example.AbstractFactory;

public class GasolineCarFactory {
    public Car createSedan(){
        return new SedanCar();
    }

    public Car createSUV(){
        return new SUVCar();
    }
}
