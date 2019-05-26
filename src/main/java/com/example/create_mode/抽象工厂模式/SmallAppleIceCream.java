package com.example.create_mode.抽象工厂模式;

public class SmallAppleIceCream implements SmallIceCream {

    @Override
    public void taste() {
        System.out.println("这是苹果味冰激凌(小份)");
    }
}
