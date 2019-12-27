package com.example.Interaction_mode.命令模式.示例2;

import java.util.ArrayList;
import java.util.List;

/**
 * 命令调用类
 */
public class Broker {
    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
