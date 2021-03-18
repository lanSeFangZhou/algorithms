package designPatternCode.ChainOfResponsibilityPattern.Demo2;

import designPatternCode.ChainOfResponsibilityPattern.Demo1.AbstractLogger;
//import jdk.internal.jline.internal.Log;

public class ErrorLogger extends AbstractLogger {
    public ErrorLogger() {
        //this.level = Log.Level.ERROR;
        //nextLogger设置为null
        //扩展时将此更改为新的Logger
        setNextLogger(null);
    }

    public void log (String message) {
        System.out.println("Error logger: " + message);
    }

    protected void write(String message) {

    }
}
