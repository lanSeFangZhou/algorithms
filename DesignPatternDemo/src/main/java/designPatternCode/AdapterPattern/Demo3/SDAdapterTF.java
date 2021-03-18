package designPatternCode.AdapterPattern.Demo3;

import designPatternCode.AdapterPattern.Demo2.SDCard;

public class SDAdapterTF implements SDCard {
    private TFCard tfcard;

    public SDAdapterTF(TFCard tfCard) {
        this.tfcard = tfCard;
    }

    public String readSD() {
        System.out.println("adapter read tf card");
        return tfcard.readTF();
    }

    public int writeSD(String msg) {
        System.out.println("adapter write tf card");
        return tfcard.writeTF(msg);
    }
}
