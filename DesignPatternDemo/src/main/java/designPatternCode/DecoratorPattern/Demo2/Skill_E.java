package designPatternCode.DecoratorPattern.Demo2;

//ConreteDecorator 技能：E
public class Skill_E extends Skills{

    private String skillName;

    public Skill_E(Hero hero, String skillName) {
        super(hero);
        this.skillName = skillName;
    }

    public void learnSkills(){
        System.out.println("学习了技能E:" + skillName);
        super.learnSkills();
    }
}
