package com.example.Interaction_mode.命令模式.示例2;

/**
 * 使用 Broker 类来接受并执行命令。
 */
public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock abcStock = new Stock();

        Broker broker = new Broker();
        broker.takeOrder(new BuyStock(abcStock));
        broker.takeOrder(new SellStock(abcStock));

        broker.placeOrders();
    }
}
