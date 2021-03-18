package designPatternCode.PrototypePattern.Demo1;

public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
