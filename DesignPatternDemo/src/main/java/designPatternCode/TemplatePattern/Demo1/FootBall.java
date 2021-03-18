package designPatternCode.TemplatePattern.Demo1;

public class FootBall extends Game {
    void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    void startPlay() {
        System.out.println("Football Game Started! Enjoy the game!");
    }

    void endPlay() {
        System.out.println("Football Game Finished!");
    }
}
