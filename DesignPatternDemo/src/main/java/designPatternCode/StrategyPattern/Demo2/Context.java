package designPatternCode.StrategyPattern.Demo2;

import designPatternCode.StrategyPattern.Demo1.Strategy;

public class Context {
    private Strategy strategy;

    public Context(){

    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
