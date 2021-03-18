package designPatternCode.ObserverPattern.Demo3;

public class BigTortoise extends Observer {

    public BigTortoise(GuanYin guanYin) {
        this.guanYin = guanYin;
        this.guanYin.attach(this);
    }

    protected void flyToGuanYin() {
        System.out.println("BigTortoise fly to guanyin");
    }
}
