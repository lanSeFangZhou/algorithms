package designPatternCode.DecoratorPattern.Demo5;

public class Magazine extends AbstractMagazine {
    public Magazine(Gun gun) {
        super(gun);
    }

    public void fire() {
        System.out.println("砰*10");
    }
}
