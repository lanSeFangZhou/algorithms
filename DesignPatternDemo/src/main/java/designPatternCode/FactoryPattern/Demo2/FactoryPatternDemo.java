package designPatternCode.FactoryPattern.Demo2;

import designPatternCode.FactoryPattern.Demo1.Rectangle;
import designPatternCode.FactoryPattern.Demo1.Square;

public class FactoryPatternDemo {
    //采用强制类型转换，这样就只需要一个对象实现工厂
    public static void main(String[] args) {
        Rectangle rect = (Rectangle)ShapeFactory.getClass(Rectangle.class);
        rect.draw();
        Square square = (Square)ShapeFactory.getClass(Square.class);
        square.draw();;
    }
}
