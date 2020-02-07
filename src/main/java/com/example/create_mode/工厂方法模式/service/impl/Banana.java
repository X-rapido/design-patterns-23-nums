package com.example.create_mode.工厂方法模式.service.impl;

import com.example.create_mode.工厂方法模式.service.Fruit;

public class Banana implements Fruit {

    @Override
    public void get(){
        System.out.println("采集香蕉");
    }
}