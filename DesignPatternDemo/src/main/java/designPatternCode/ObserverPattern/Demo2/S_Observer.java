package designPatternCode.ObserverPattern.Demo2;

public class S_Observer extends Observer {
    public void update(String msg) {
        System.out.println(S_Observer.class.getName() + " : " + msg);
    }
}
