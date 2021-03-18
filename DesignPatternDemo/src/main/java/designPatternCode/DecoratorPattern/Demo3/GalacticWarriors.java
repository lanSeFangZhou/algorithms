package designPatternCode.DecoratorPattern.Demo3;

public class GalacticWarriors extends HeroDecorator {

    private Hero heroDecorator;

    public GalacticWarriors(Hero heroDecorator) {
        super(heroDecorator);
    }

    public void init() {
        super.init();
        setSkin();
    }

    private void setSkin(){
        System.out.println("皮肤:银河战士套装");
    }
}
