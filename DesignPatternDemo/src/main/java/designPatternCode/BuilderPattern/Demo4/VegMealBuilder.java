package designPatternCode.BuilderPattern.Demo4;

import designPatternCode.BuilderPattern.Demo1.Coke;
import designPatternCode.BuilderPattern.Demo1.Meal;
import designPatternCode.BuilderPattern.Demo1.VegBurger;

//具体的建造者
public class VegMealBuilder extends Builder {
    public void prepareVegMeal(){
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
    }
    public void prepareNonVegMeal(){}
    public Meal getMeal(){
        return meal;
    }

}
