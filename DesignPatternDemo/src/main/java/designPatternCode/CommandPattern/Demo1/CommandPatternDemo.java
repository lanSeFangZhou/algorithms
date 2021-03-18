package designPatternCode.CommandPattern.Demo1;

public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Brocker brocker = new Brocker();
        brocker.takeOrder(buyStockOrder);
        brocker.takeOrder(sellStockOrder);

        brocker.placeOrders();
    }
}
