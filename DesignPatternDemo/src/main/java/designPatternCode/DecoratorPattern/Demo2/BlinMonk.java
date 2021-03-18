package designPatternCode.DecoratorPattern.Demo2;

//ConcreteComponent 具体英雄盲僧
public class BlinMonk implements Hero{

    private String name;

    public BlinMonk(String name) {
        this.name = name;
    }

    public void learnSkills() {
        System.out.println(name + "学习了以上技能！");
    }
}
