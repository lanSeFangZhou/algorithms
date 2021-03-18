package designPatternCode.VisitorPattern.Demo1;

public class VisitorPatternDemo {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputePartVisitor());
    }
}
