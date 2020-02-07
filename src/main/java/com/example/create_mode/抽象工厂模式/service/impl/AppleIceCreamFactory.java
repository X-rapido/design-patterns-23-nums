package com.example.create_mode.抽象工厂模式.service.impl;

import com.example.create_mode.抽象工厂模式.service.BigIceCream;
import com.example.create_mode.抽象工厂模式.service.SmallIceCream;
import com.example.create_mode.抽象工厂模式.service.IceCreamFactory;

/**
 * 苹果味冰激凌工厂
 */
public class AppleIceCreamFactory implements IceCreamFactory {

    @Override
    public BigIceCream createBigIceCream() {
        return new BigAppleIceCream();
    }

    @Override
    public SmallIceCream createSmallIceCream() {
        return new SmallAppleIceCream();
    }
}
