package com.example.Interaction_mode.策略模式.service.impl;

import com.example.Interaction_mode.策略模式.service.Strategy;

/**
 * 老客户大批量策略
 */
public class OldCustomerManyStrategy implements Strategy {

    @Override
    public double getPrice(double standardPrice) {
        System.out.println("打八折");
        return standardPrice * 0.8;
    }

}
