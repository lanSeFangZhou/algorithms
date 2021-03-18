package designPatternCode.DecoratorPattern.Demo5;

public class Telescope4X extends AbstractTelescope4X{

    public Telescope4X(Gun gun){
        super(gun);
    }

    public void aim4X() {
        System.out.println("已进入4倍瞄准模式");
    }
}
