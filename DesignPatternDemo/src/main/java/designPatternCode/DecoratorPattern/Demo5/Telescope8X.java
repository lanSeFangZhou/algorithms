package designPatternCode.DecoratorPattern.Demo5;

public class Telescope8X extends AbstractTeleascope8X {
    public Telescope8X(Gun gun) {
        super(gun);
    }

    public void aim8X() {
        System.out.println("进入8倍瞄准模式");
    }

    public void aim4X() {
        System.out.println("进入4倍瞄准模式");
    }
}
