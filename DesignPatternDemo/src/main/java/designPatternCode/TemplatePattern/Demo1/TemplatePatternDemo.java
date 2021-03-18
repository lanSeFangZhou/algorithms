package designPatternCode.TemplatePattern.Demo1;

public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new FootBall();
        game.play();
    }
}
