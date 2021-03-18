package designPatternCode.VisitorPattern.Demo1;

public class KeyBoard implements ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
