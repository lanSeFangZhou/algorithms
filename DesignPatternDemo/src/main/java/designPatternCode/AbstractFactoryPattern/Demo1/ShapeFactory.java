package designPatternCode.AbstractFactoryPattern.Demo1;

public class ShapeFactory extends AbstractFactory {
    public Color getColor(String color) {
        return null;
    }

    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Reatangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
