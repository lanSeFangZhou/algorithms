package designPatternCode.BuilderPattern.Demo2;

import designPatternCode.BuilderPattern.Demo1.Burger;

public class OrderBuilder {
    private Burger mBurger;
//    private Suit mSuit;
//
//    //单点汉堡,num为数量
//    public OrderBuilder burger(Burger burger, int num) {
//        mBurger = burger;
//    }
//
//    //点套餐，实际中套餐也可以点多份
//    public OrderBuilder suit(Suit suit, int num) {
//        mSuit = suit;
//    }
//
//    //完成订单
//    //订单要求价格至少达到 30 块:
//    public Order build(){
//        Order order = new Order();
//        order.setBurger(mBurger);
//        order.setSuit(mSuit);
//        if (order.getPrice() < 30) {
//            throw new BuildException("订单金额未达到30元");
//        }
//        return order;
//    }
}
