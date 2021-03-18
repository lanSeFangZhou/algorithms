package designPatternCode.BuilderPattern.Demo4;

import designPatternCode.BuilderPattern.Demo1.Meal;
//import jdk.internal.jline.internal.TestAccessible;

public class Test {
    //@Test
    public void BuilderPatternDemo() {
        Director director = new Director();
        VegMealBuilder b1 = new VegMealBuilder();
        NonVegMealBuilder b2 = new NonVegMealBuilder();
        director.Construct(b1);
        director.Construct(b2);
        Meal vegMeal = b1.getMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total cost: " + vegMeal.getCost());
        Meal nonVegMeal = b2.getMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total cost: " + nonVegMeal.getCost());
    }
}
