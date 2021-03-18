package designPatternCode.StatePattern.Demo3;

import designPatternCode.StatePattern.Demo2.CloseState;
import designPatternCode.StatePattern.Demo2.Context;
import designPatternCode.StatePattern.Demo2.State;

public class StartState implements State {
    public void start(Context context) {

    }

    public void close(Context context) {
        context.setState(new CloseState());//注意状态的切换
        System.out.println("close state");
    }
}
