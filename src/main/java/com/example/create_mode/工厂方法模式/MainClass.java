package com.example.create_mode.工厂方法模式;

public class MainClass {
    public static void main(String[] args) {
        // 苹果
        FruitFactory ff = new AppleFactory();
        Fruit apple = ff.getFruit();
        apple.get();

        // 香蕉
        FruitFactory ff2 = new BananaFactory();
        Fruit banana = ff2.getFruit();
        banana.get();

        // 梨
        FruitFactory ff3 = new PearFactory();
        Fruit pear = ff3.getFruit();
        pear.get();
    }
}
