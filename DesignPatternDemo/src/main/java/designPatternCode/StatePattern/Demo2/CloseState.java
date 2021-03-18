package designPatternCode.StatePattern.Demo2;

public class CloseState implements State {
    public void start(Context context) {
        System.out.println("start here");
    }

    public void close(Context context) {
        // do nothing
    }
}
