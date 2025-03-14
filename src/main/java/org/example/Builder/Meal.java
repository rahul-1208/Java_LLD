package org.example.Builder;

public class Meal {
    private String mainCourse;
    private String drinks;
    private String sideDishes;
    private String desserts;


    public Meal(String mainCourse, String drinks, String sideDishes, String desserts) {
        this.mainCourse = mainCourse;
        this.drinks = drinks;
        this.sideDishes = sideDishes;
        this.desserts = desserts;
    }

    public String getMainCourse(){
        return this.mainCourse;
    }

    public String getDrinks(){
        return this.drinks;
    }

    public String getSideDishes(){
        return this.sideDishes;
    }

    public String getDesserts(){
        return this.desserts;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "mainCourse='" + mainCourse + '\'' +
                ", drinks='" + drinks + '\'' +
                ", sideDishes='" + sideDishes + '\'' +
                ", desserts='" + desserts + '\'' +
                '}';
    }
}
