package designPatternCode.ChainOfResponsibilityPattern.Demo2;

import designPatternCode.ChainOfResponsibilityPattern.Demo1.AbstractLogger;

public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger() {
//        this.level = Level.INFO;
//        //指定nextLogger为FileLogger
//        setNextLogger(new FileLogger());
    }

    public void log(String message) {
        System.out.println("Console logger: " + message);
    }

    protected void write(String message) {

    }
}
