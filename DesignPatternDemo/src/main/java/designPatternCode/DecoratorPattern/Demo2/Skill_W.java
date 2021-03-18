package designPatternCode.DecoratorPattern.Demo2;

//ConreteDecorator 技能：W
public class Skill_W extends Skills {

    private String skillName;

    public Skill_W(Hero hero, String skillName) {
        super(hero);
        this.skillName = skillName;
    }

    public void learnSkills(){
        System.out.println("学习了技能W:" + skillName);
        super.learnSkills();
    }
}
