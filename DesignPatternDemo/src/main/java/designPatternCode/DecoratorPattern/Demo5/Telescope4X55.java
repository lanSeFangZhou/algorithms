package designPatternCode.DecoratorPattern.Demo5;

public class Telescope4X55 extends AbstractTelescope4X {
    public Telescope4X55(Gun gun) {
        super(gun);
    }

    public void aim4X() {
        System.out.println("4倍超级瞄准已部署");
    }
}
