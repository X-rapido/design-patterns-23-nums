package com.example.Interaction_mode.策略模式.service.impl;

import com.example.Interaction_mode.策略模式.service.Strategy;

/**
 * 普通客户大批量策略
 */
public class CustomerManyStrategy implements Strategy {

    @Override
    public double getPrice(double standardPrice) {
        System.out.println("打九折");
        return standardPrice * 0.9;
    }

}
