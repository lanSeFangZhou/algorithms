package designPatternCode.StatePattern.Demo2;

public class StartState implements State {
    public void start(Context context) {
        // do nothing
    }

    public void close(Context context) {
        System.out.println("Close state");
    }
}
