# 设计模式详解

#### Design Patterns - Elements of Reusable Object-Oriented Software（中文译名：设计模式 - 可复用的面向对象软件元素）

## 创建型模式
对象怎么来

1.工厂模式(Factory Pattern)
2.抽象工厂模式(Abstract Factory Pattern)
3.单例模式(Singleton Pattern)
4.建造者模式(Builder Pattern)
5.原型模式(Prototype Pattern)


## 结构型模式
对象和谁有关

1.适配器模式(Adapter Pattern)
2.桥接模式(Bridge Pattern)
3.过滤器模式(Filter 、 Criteria Pattern)
4.组合模式(Composite Pattern)
5.装饰器模式(Decorator Pattern)
6.外观模式(Facade Pattern)
7.享元模式(Flyweight Pattern)
8.代理模式(Proxy Pattern)


## 行为型模式
对象和对象在干嘛

1.责任链模式(Chain of Responsibility Pattern)
2.命令模式(Command Pattern)
3.解释器模式(Interpreter Pattern)
4.迭代器模式(Iterator Pattern)
5.中介者模式(Mediator Pattern)
6.备忘录模式(Memento Pattern)
7.观察者模式(Observer Pattern)
8.状态模式(State Pattern)
9.空对象模式(Null Object Pattern)
10.策略模式(Strategy Pattern)
11.模板模式(Template Pattern)
12.访问者模式(Visitor Pattern)

## J2EE模式
对象合起来要干嘛

1.MVC模式(MVC Pattern)
2.业务代表模式(Business Delegate Pattern)
3.组合实体模式(Composite Entity Pattern)
4.数据访问对象模式(Data Access Object Pattern)
5.前端控制器模式(Front Controller Pattern)
6.拦截过滤器模式(Intercepting Filter Pattern)
7.服务定位模式(Service Locator Pattern)
8.传输对象模式(Transfer Object Pattern)



# 设计模式的六大原则(开口里合最单一)
1.开闭原则(Open Close Principle):对扩展开放，对修改关闭
```
在程序进行拓展的时候，不能去修改原有的代码，实现一个热插拔的效果。简言之，是为了使程序的扩展性好，易于维护和升级。
想达到这样的效果，我们需要使用接口和抽象类，后面的具体设计中我们会提到这点。

实现热插拔，提高扩展性。
```
2.里氏替换原则(Liskov Substitution Principle)
```text
任何基类出现的地方，子类一定可以出现。LSP是继承复用的基石，只有当派生类可以替换掉基类，且软件单位的功能不受到
影响时，基类才能真正被复用，且派生类也能够在基类的基础上增加新的行为。
里氏替换原则是对开闭原则的补充。实现开闭原则的关键步骤就是抽象化，而基类与子类的继承关系就是抽象化的具体实现，
所以里氏替换原则是对实现抽象化的具体步骤的规范。

实现抽象的规范，实现子父类互相替换

```
3.依赖倒置原则(Dependence Inversion Principle)
```text
针对接口编程，依赖于抽象而不依赖于具体

针对接口编程，实现开闭原则的基础

```
4.接口隔离原则(Interface Segregation Principle)
```text
使用多个隔离的接口，比使用单个接口好。
降低类之间的耦合度。
从大型软件架构出发，便于升级和维护的软件设计思想，强调降低依赖，降低耦合。

降低耦合度，接口单独设计，互相隔离

高内聚:类成员之间的关系
低耦合:类与类之间的关系

接口隔离:一个类对另外一个类的依赖性应当是建立在最小的接口上的；客户端程序不应该依赖它不需要的接口方法或功能


对接口的污染:利用委托分离接口；利用多继承分离接口
```
5.迪米特法则，又称最少知道原则(Demeter Principle)
```text
一个实体应当尽量少地与其他实体之间相互作用，使得系统功能模块相对独立。

功能模块尽量独立

```
6.合成复用原则(Composite Reuse Principle)
```text
尽量使用合成/聚合的方式，而不是使用继承。

尽量使用聚合，组合，而不是继承

```
