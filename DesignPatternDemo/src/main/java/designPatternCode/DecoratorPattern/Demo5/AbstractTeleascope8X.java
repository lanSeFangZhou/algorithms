package designPatternCode.DecoratorPattern.Demo5;

public abstract class AbstractTeleascope8X implements Aim8X {
    private Gun gun;

    public AbstractTeleascope8X(Gun gun) {
        this.gun = gun;
    }

    public void fire() {
        gun.fire();
    }
}
