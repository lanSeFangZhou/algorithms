package designPatternCode.DecoratorPattern.Demo5;

public abstract class AbstractTelescope4X implements Aim4X {

    private Gun gun;

    public AbstractTelescope4X(Gun gun) {
        this.gun = gun;
    }

    public void fire() {
        gun.fire();
    }
}
