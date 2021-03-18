package designPatternCode.DecoratorPattern.Demo5;

public abstract class AbstractMagazine implements Gun {

    private Gun gun;

    public AbstractMagazine(Gun gun) {
        this.gun = gun;
    }

    public void fire(){
        gun.fire();
    }
}
