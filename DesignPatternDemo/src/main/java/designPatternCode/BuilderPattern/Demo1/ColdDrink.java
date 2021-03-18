package designPatternCode.BuilderPattern.Demo1;

public abstract class ColdDrink implements Item {

    public Packing packing() {
        return new Bottle();
    }

    public abstract  float price();
}
