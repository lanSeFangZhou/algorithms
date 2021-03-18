package designPatternCode.BuilderPattern.Demo3;

//具体的建造者角色
public class ConcreteBuilder1 extends Builder {
    ////假设 buffer.toString() 就是最终生成的产品
    private StringBuffer buffer = new StringBuffer();

    //实现构建最终实例需要的所有方法
    public void buildPart1() {
        buffer.append("Builder1 : Part1\n");
    }

    public void buildPart2() {
        buffer.append("Builder1 : Part2\n");
    }

    public void buildPart3() {
        buffer.append("Builder1 : Part3\n");
    }

    //定义获取最终生成实例的方法
    public String getResult(){
        return buffer.toString();
    }
}
