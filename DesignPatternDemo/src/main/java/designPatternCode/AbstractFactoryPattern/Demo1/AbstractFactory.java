package designPatternCode.AbstractFactoryPattern.Demo1;

public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
