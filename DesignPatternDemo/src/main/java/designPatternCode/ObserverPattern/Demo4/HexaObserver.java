package designPatternCode.ObserverPattern.Demo4;

import java.util.Observable;
import java.util.Observer;

public class HexaObserver implements Observer {
    public HexaObserver(Observable observable) {
        observable.addObserver(this);
    }


    public void update(Observable o, Object arg) {
        if (o instanceof Subject) {
            System.out.println("Binary String : " + Integer.toHexString(((Subject) o).getState()));
        }
    }
}
