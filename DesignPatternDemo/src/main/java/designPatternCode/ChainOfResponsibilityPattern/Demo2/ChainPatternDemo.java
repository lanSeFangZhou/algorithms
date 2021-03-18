package designPatternCode.ChainOfResponsibilityPattern.Demo2;

import designPatternCode.ChainOfResponsibilityPattern.Demo1.AbstractLogger;

public class ChainPatternDemo {
    public static void main(String[] args) {
        //暴露最低等级既可
        AbstractLogger consoleLogger = new ConsoleLogger();
        consoleLogger.logMessage(3, "错误信息");
        System.out.println();
        consoleLogger.logMessage(2, "测试信息");
        System.out.println();
        consoleLogger.logMessage(1, "控制台信息");
    }
}
