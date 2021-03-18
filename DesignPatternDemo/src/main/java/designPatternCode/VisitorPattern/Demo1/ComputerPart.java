package designPatternCode.VisitorPattern.Demo1;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
