package designPatternCode.DecoratorPattern.Demo5;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("[捡起一把98K]");
        Gun gun = new Kar98K();
        System.out.println("[装饰上4倍镜]");
        Aim4X aim4X = new Telescope4X(gun);
        System.out.println("[4倍瞄准]");
        aim4X.aim4X();
        System.out.println("[开炮！]");
        aim4X.fire();
        System.out.println("[先装饰上弹匣]");
        gun = new Magazine(gun);
        System.out.println("[再装饰上4倍镜]");
        aim4X = new Telescope4X(gun);
        System.out.println("[4倍瞄准]");
        aim4X.aim4X();
        System.out.println("[开炮！]");
        aim4X.fire();
        System.out.println("[人体描边？换上我的55式4倍镜]");
        aim4X = new Telescope4X55(gun);
        System.out.println("[4倍瞄准]");
        aim4X.aim4X();
        System.out.println("[开炮！]");
        aim4X.fire();
    }
}
