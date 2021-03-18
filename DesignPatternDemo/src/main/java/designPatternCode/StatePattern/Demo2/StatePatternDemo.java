package designPatternCode.StatePattern.Demo2;

public class StatePatternDemo {
    public static void main(String... args) {
        Context context = new Context();

        // 初始为开始状态
        context.setState(new StartState());
        // 切换为关闭状态
        context.close();
        // 切换为开始状态
        context.start();
    }
}
