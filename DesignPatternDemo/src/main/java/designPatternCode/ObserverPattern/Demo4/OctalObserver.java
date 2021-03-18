package designPatternCode.ObserverPattern.Demo4;


import java.util.Observable;
import java.util.Observer;

public class OctalObserver implements Observer {
    public OctalObserver(Observable observable) {
        observable.addObserver(this);
    }

    public void update(Observable o, Object arg) {
        if (o instanceof Subject) {
            System.out.println("Binary String: " + Integer.toOctalString(((Subject)o).getState()));
        }

    }
}
