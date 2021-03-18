package designPatternCode.FacadePattern.Demo2;

/** * 硬盘类 */
public class Ssd implements Computer {
    public void open() {
        System.out.println("启动硬盘");
    }
}
