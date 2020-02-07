package com.example.create_mode.抽象工厂模式.service.impl;

import com.example.create_mode.抽象工厂模式.service.BigIceCream;

public class BigOrangeIceCream implements BigIceCream {

    @Override
    public void taste() {
        System.out.println("这是橘子味冰激凌(大份)");
    }
}
