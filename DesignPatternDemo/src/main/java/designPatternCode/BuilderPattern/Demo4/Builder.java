package designPatternCode.BuilderPattern.Demo4;

import designPatternCode.BuilderPattern.Demo1.Meal;

//抽象建造者 1
public class Builder {
    public Meal meal = new Meal();
    public void prepareVegMeal(){};
    public void prepareNonVegMeal(){};
    public Meal getMeal(){return null;}
}
