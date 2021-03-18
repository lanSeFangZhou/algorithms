package designPatternCode.AdapterPattern.Demo2;

public class ThinkpadComputer implements Computer {
    public String readSD(SDCard sdCard) {
        if (sdCard == null) throw new NullPointerException("sd card null");
        return sdCard.readSD();
    }
}
