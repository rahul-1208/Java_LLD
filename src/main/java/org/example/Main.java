package org.example;

import org.example.AbstractFactory.Car;
import org.example.AbstractFactory.ElectricCarFactory;
import org.example.Builder.Meal;
import org.example.Builder.MealBuilder;

import org.example.Decorator.BoldDecorator;
import org.example.Decorator.ItalicDecorator;
import org.example.Decorator.PlainText;
import org.example.Decorator.Text;
import org.example.Factory.CarFactory;
import org.example.Observer.NewsAgency;
import org.example.Observer.NewsReader;
import org.example.Singleton.Logger;
import org.example.State.VendingMachine;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {

//        STATE
        VendingMachine vendingMachine = new VendingMachine();
        // First Purchase
        vendingMachine.insertMoney();
        vendingMachine.makeSelection();
        vendingMachine.dispenseItem();
        System.out.println();

        // Second Purchase (Last stock)
        vendingMachine.insertMoney();
        vendingMachine.makeSelection();
        vendingMachine.dispenseItem();
        System.out.println();

        // Third Purchase (Out of Stock)
        vendingMachine.insertMoney();
        vendingMachine.makeSelection();
        vendingMachine.dispenseItem();


        //OBSERVER
//        NewsAgency newsAgency = new NewsAgency();
//        NewsReader newsReader = new NewsReader();
//
//        newsAgency.attach(newsReader);
//        newsAgency.setNews("This is my first News");



        //DECORATOR
//        Text text = new PlainText("Hello World");
//
//        text = new BoldDecorator(text);
//        System.out.println("Bold "+text.getText());
//
//        text = new ItalicDecorator(text);
//        System.out.println("Bold + Italic "+text.getText());




        //ABSTRACT FACTORY
//        ElectricCarFactory electricCarFactory = new ElectricCarFactory();
//        Car electricSedan = electricCarFactory.createSedan();
//        electricSedan.drive();
//        System.out.println(electricSedan.price());
//
//        Car electricSUV = electricCarFactory.createSUV();
//        electricSUV.drive();
//        System.out.println(electricSUV.price());


        //FACTORY
//        Car car1 = CarFactory.createCar("Sedan");
//        car1.drive();
//        System.out.println(car1.getPrice());
//
//
//        Car car2 = CarFactory.createCar("suv");
//        car2.drive();
//        System.out.println(car2.getPrice());

        //BUILDER
//        Meal indianMeal = new MealBuilder()
//                .addMainCourse("ButterChicken")
//                .addDesserts("Gulab Jamun")
//                .addDrinks("Tea")
//                .addSideDishes("Naan")
//                .build();
//
//        System.out.println(indianMeal);
//
//        Meal simpleMeal = new MealBuilder()
//                .addMainCourse("Biryani")
//                .addDrinks("Lassi")
//                .build();
//        System.out.println(simpleMeal);




        //SINGLETON
//        Runnable logTask = () -> {
//            // Each thread gets the Logger instance
//            Logger logger = Logger.getLogger();
//            // Log a message from this thread
//            logger.log("Thread " + Thread.currentThread().getName() + " is logging a message.");
//        };
//
//        ExecutorService executor = Executors.newFixedThreadPool(4);
//
//        executor.submit(logTask);
//        executor.submit(logTask);
//        executor.submit(logTask);
//        executor.submit(logTask);
//
//        executor.shutdown();
//
//        // Wait for all tasks to finish (shutdown has to complete before proceeding)
//        while (!executor.isTerminated()) {
//            // Wait for all tasks to finish
//        }
//
//        // Check if all threads got the same Logger instance
//        Logger logger1 = Logger.getLogger();
//        Logger logger2 = Logger.getLogger();
//
//        // Print out whether both references point to the same instance (Singleton check)
//        System.out.println("Are both loggers the same instance? " + logger1.equals(logger2));
    }
}
