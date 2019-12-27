package com.example.Interaction_mode.命令模式.示例2;

/**
 * Order 接口的实体类1
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
