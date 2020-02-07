package com.example.create_mode.工厂方法模式.service.impl;

import com.example.create_mode.工厂方法模式.service.Fruit;

public class Pear implements Fruit {

    @Override
    public void get() {
        System.out.println("采集梨");
    }

}
