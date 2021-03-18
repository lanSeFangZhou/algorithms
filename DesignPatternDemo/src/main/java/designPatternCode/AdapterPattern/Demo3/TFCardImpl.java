package designPatternCode.AdapterPattern.Demo3;

public class TFCardImpl implements TFCard {
    public String readTF() {
        String msg = "tf card read msg : hello world tf card";
        return msg;
    }

    public int writeTF(String msg) {
        System.out.println("tf card write a msg : " + msg);
        return 1;
    }
}
