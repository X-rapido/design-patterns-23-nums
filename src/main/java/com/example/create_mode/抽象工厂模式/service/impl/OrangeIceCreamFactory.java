package com.example.create_mode.抽象工厂模式.service.impl;

import com.example.create_mode.抽象工厂模式.service.BigIceCream;
import com.example.create_mode.抽象工厂模式.service.SmallIceCream;
import com.example.create_mode.抽象工厂模式.service.IceCreamFactory;

/**
 * 橘子味冰激凌工厂
 */
public class OrangeIceCreamFactory  implements IceCreamFactory {

    @Override
    public BigIceCream createBigIceCream() {
        return new BigOrangeIceCream();
    }

    @Override
    public SmallIceCream createSmallIceCream() {
        return new SmallOrangeIceCream();
    }
}