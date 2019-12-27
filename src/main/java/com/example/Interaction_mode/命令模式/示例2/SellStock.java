package com.example.Interaction_mode.命令模式.示例2;

/**
 * Order 接口的实体类2
 */
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}