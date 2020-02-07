package com.example.create_mode.抽象工厂模式.service.impl;

import com.example.create_mode.抽象工厂模式.service.BigIceCream;

public class BigAppleIceCream implements BigIceCream {

    @Override
    public void taste() {
        System.out.println("这是苹果味冰激凌(大份)");
    }
}
