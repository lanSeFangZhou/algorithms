package designPatternCode.DecoratorPattern.Demo1;

public class RedshapeDecorator extends ShapeDecorator {

    public RedshapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    public void draw(){
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border Color: Red");
    }
}
