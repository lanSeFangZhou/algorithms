package designPatternCode.StrategyPattern.Demo2;

import designPatternCode.StrategyPattern.Demo1.OperationAdd;
import designPatternCode.StrategyPattern.Demo1.OperationMultiply;
import designPatternCode.StrategyPattern.Demo1.OperationSubtract;

public class Demo2 {
    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context.setStrategy(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));
        context.setStrategy(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
