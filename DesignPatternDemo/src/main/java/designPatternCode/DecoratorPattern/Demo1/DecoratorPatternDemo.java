package designPatternCode.DecoratorPattern.Demo1;

public class DecoratorPatternDemo {
    public static void main(String[] args) {

        Shape circle = new Circle();
        ShapeDecorator redCircle = new RedshapeDecorator(new Circle());
        ShapeDecorator redRectangle = new RedshapeDecorator(new Rectangle());
        //Shape redCircle = new RedshapeDecorator(new Circle());
        //Shape redRectangle = new RedshapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
