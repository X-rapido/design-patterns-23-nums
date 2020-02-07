package com.example.create_mode.抽象工厂模式;

import com.example.create_mode.抽象工厂模式.service.BigIceCream;
import com.example.create_mode.抽象工厂模式.service.IceCreamFactory;
import com.example.create_mode.抽象工厂模式.service.SmallIceCream;
import com.example.create_mode.抽象工厂模式.service.impl.AppleIceCreamFactory;
import com.example.create_mode.抽象工厂模式.service.impl.OrangeIceCreamFactory;

public class MainClass {
    public static void main(String[] args) {

        // 生产苹果味冰激凌
        IceCreamFactory appleFactory = new AppleIceCreamFactory();
        BigIceCream appleBig = appleFactory.createBigIceCream();
        SmallIceCream appleSmall = appleFactory.createSmallIceCream();
        appleBig.taste();
        appleSmall.taste();

        // 生产橘子味冰激凌
        IceCreamFactory orangeFactory = new OrangeIceCreamFactory();
        BigIceCream orangeBig = orangeFactory.createBigIceCream();
        SmallIceCream orangeSmall = orangeFactory.createSmallIceCream();
        orangeBig.taste();
        orangeSmall.taste();
    }
}
