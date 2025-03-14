package org.example.Builder;

public class MealBuilder {
    private String mainCourse;
    private String drinks;
    private String sideDishes;
    private String desserts;


    public MealBuilder addMainCourse(String mainCourse){
        this.mainCourse = mainCourse;
        return this;
    }

    public MealBuilder addDrinks(String drinks){
        this.drinks=drinks;
        return this;
    }

    public MealBuilder addSideDishes(String sideDishes){
        this.sideDishes = sideDishes;
        return this;
    }

    public MealBuilder addDesserts(String desserts){
        this.desserts = desserts;
        return this;
    }

    public Meal build(){
        return new Meal(mainCourse, drinks, sideDishes, desserts);
    }
}
