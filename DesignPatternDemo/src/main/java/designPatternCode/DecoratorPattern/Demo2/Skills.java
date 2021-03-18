package designPatternCode.DecoratorPattern.Demo2;

//Decorator 技能栏
public class Skills implements Hero{

    //持有一个英雄对象接口
    private Hero hero;

    public Skills(Hero hero) {
        this.hero = hero;
    }

    public void learnSkills() {
        if (hero != null) {
            hero.learnSkills();
        }
    }
}
