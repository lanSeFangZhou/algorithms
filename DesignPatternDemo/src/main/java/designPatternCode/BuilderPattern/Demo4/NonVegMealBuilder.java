package designPatternCode.BuilderPattern.Demo4;

import designPatternCode.BuilderPattern.Demo1.ChickenBurger;
import designPatternCode.BuilderPattern.Demo1.Meal;
import designPatternCode.BuilderPattern.Demo1.Pespi;

//具体建造者
public class NonVegMealBuilder extends Builder {
    public void prepareVegMeal(){}
    public void prepareNonVegMeal(){
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pespi());
    }
    public Meal getMeal(){
        return meal;
    }
}
