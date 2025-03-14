package org.example.AbstractFactory;

public class ElectricCarFactory {

//    public Car createCar(String type){
//        if(type.equalsIgnoreCase("Sedan")){
//            return new SedanCar();
//        }else if(type.equalsIgnoreCase("SUV")){
//            return new SUVCar();
//        }else{
//            return null;
//        }
//    }

    public Car createSedan(){
        return new SedanCar();
    }

    public Car createSUV(){
        return new SUVCar();
    }
}
