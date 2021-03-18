package designPatternCode.StatePattern.Demo3;

import designPatternCode.StatePattern.Demo2.Context;
import designPatternCode.StatePattern.Demo2.State;

public class CloseState implements State {
    public void start(Context context) {
        context.setState(new StartState());//注意状态的切换
        System.out.println("start State");
    }

    public void close(Context context) {
    }
}
