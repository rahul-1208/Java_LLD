package org.example.Factory;

public class CarFactory {

    public static Car createCar(String type){
        if(type.equalsIgnoreCase("Sedan")){
            return new SedanCar();
        }
        else if(type.equalsIgnoreCase("SUV")){
            return new SUVCar();
        }
        else{
            return null;
        }
    }
}
