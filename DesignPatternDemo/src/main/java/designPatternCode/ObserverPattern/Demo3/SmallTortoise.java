package designPatternCode.ObserverPattern.Demo3;

public class SmallTortoise extends Observer {

    public SmallTortoise(GuanYin guanYin) {
        this.guanYin = guanYin;
        this.guanYin.attach(this);
    }

    protected void flyToGuanYin() {
        System.out.println("SmallTortoise fly to guanyin");
    }
}
