package designPatternCode.NullObjectPattern.Demo1;

public class NullCustomer extends AbstractCustomer {
    public boolean isNil() {
        return true;
    }

    public String getName() {
        return "Not Available in Customer Database";
    }
}
