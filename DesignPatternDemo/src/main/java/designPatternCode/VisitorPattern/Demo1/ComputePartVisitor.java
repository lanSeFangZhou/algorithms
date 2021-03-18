package designPatternCode.VisitorPattern.Demo1;

public class ComputePartVisitor implements ComputerPartVisitor {
    public void visit(Computer computer) {
        System.out.println("Displaying computer.");
    }

    public void visit(Mouse mouse) {
        System.out.println("Displaying mouse.");
    }

    public void visit(KeyBoard keyBoard) {
        System.out.println("Displaying keyboard.");
    }

    public void visit(Monitor monitor) {
        System.out.println("Displaying monitor.");
    }
}
