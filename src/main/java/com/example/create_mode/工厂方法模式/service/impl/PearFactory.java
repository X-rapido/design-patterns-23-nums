package com.example.create_mode.工厂方法模式.service.impl;

import com.example.create_mode.工厂方法模式.service.Fruit;
import com.example.create_mode.工厂方法模式.service.FruitFactory;

public class PearFactory implements FruitFactory {

    @Override
    public Fruit getFruit() {
        return new Pear();
    }
}

