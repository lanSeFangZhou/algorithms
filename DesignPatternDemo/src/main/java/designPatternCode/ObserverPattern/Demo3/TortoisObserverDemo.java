package designPatternCode.ObserverPattern.Demo3;

public class TortoisObserverDemo {
    public static void main(String[] args) {
        GuanYin guanYin = new GuanYin();

        new SmallTortoise(guanYin);
        new BigTortoise(guanYin);

        guanYin.watering();
    }
}
