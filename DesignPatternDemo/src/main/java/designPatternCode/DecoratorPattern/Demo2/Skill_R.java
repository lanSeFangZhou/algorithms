package designPatternCode.DecoratorPattern.Demo2;

//ConreteDecorator 技能：R
public class Skill_R extends Skills {

    private String skillName;

    public Skill_R(Hero hero, String skillName) {
        super(hero);
        this.skillName = skillName;
    }

    public void learnSkills(){
        System.out.println("学习了技能R:" + skillName);
        super.learnSkills();
    }
}
