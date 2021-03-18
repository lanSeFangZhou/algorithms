package designPatternCode.ObserverPattern.Demo3;

import java.util.ArrayList;
import java.util.List;

public class GuanYin {
    private List<Observer> observers = new ArrayList<Observer>();

    public void watering() {
        System.out.println("观音洒水");
        notifyAllTortoise();
    }

    private void notifyAllTortoise() {
        int i = 0;
        for (Observer o : observers) {
            o.flyToGuanYin();
            System.out.println(++i);
        }
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }
}
