package designPatternCode.BuilderPattern.Demo4;

//指挥者 2
public class Director {
    public void Construct(Builder builder) {
        builder.prepareVegMeal();
        builder.prepareNonVegMeal();
    }
}
