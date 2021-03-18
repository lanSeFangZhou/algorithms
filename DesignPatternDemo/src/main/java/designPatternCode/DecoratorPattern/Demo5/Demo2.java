package designPatternCode.DecoratorPattern.Demo5;

public class Demo2 {
    public static void main(String[] args) {
        Gun gun = new Kar98K();
        System.out.println("[先装饰上弹匣]");
        gun = new Magazine(gun);
        System.out.println("[再装饰上8倍镜]");
        Telescope8X aim8X = new Telescope8X(gun);
        System.out.println("[8倍瞄准]");
        aim8X.aim8X();
        System.out.println("[敌人很近，换4倍]");
        aim8X.aim4X();
        System.out.println("[开炮！]");
        aim8X.fire();
    }
}
