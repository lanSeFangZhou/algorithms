package designPatternCode.BuilderPattern.Demo3;

public class Director { // 将一个复杂的构建过程与其表示相分离
    private Builder builder; // 针对接口编程，而不是针对实现编程
    public Director(Builder builder) {
        this.builder = builder;
    }
    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public void construct() { // 控制（定义）一个复杂的构建过程
        builder.buildPart1();
        // 提示：如果想在运行过程中替换构建算法，可以考虑结合策略模式。
        for (int i = 0; i < 5; i++) {
            builder.buildPart2();
        }
        builder.buildPart3();
    }
}
