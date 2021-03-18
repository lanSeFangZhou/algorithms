package designPatternCode.FactoryPattern.Demo3;

import designPatternCode.FactoryPattern.Demo1.Rectangle;
import designPatternCode.FactoryPattern.Demo1.Shape;
import designPatternCode.FactoryPattern.Demo1.Square;

public class FactoryPatternDemo {
    //省略强制类型转换，支持多态
    public static void main(String[] args) {
        Rectangle rect = ShapeFactory.getClass(Rectangle.class);
        rect.draw();
        Shape square = ShapeFactory.getClass(Square.class);
        square.draw();
    }
}
