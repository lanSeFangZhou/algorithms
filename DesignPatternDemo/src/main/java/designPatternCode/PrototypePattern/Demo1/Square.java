package designPatternCode.PrototypePattern.Demo1;

public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
