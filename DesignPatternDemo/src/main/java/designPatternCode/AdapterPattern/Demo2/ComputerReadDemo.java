package designPatternCode.AdapterPattern.Demo2;

public class ComputerReadDemo {
    public static void main(String[] args) {
        Computer computer = new ThinkpadComputer();
        SDCard sdCard = new SDCardImpl();
        System.out.println(computer.readSD(sdCard));
    }
}
