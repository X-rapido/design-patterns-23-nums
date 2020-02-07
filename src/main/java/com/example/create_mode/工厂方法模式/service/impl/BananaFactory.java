package com.example.create_mode.工厂方法模式.service.impl;

import com.example.create_mode.工厂方法模式.service.Fruit;
import com.example.create_mode.工厂方法模式.service.FruitFactory;
import com.example.create_mode.工厂方法模式.service.impl.Banana;

public class BananaFactory implements FruitFactory {

    @Override
    public Fruit getFruit() {
        return new Banana();
    }
}
