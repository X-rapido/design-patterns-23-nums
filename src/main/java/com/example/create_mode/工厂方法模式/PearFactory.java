package com.example.create_mode.工厂方法模式;

public class PearFactory implements FruitFactory {

    @Override
    public Fruit getFruit() {
        return new Pear();
    }
}

