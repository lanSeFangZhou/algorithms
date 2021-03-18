package designPatternCode.DecoratorPattern.Demo3;

public abstract class HeroDecorator implements Hero {

    private Hero heroDecorator;

    public HeroDecorator(Hero heroDecorator) {
        this.heroDecorator = heroDecorator;
    }

    public void init() {
        heroDecorator.init();
    }
}
