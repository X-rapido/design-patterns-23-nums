package com.example.create_mode.工厂方法模式;

public class BananaFactory implements FruitFactory {

    @Override
    public Fruit getFruit() {
        return new Banana();
    }
}
