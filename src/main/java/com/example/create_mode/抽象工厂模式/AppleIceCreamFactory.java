package com.example.create_mode.抽象工厂模式;

/**
 * 苹果味冰激凌工厂
 */
public class AppleIceCreamFactory implements IceCreamFactory {

    @Override
    public BigIceCream createBigIceCream() {
        return new BigAppleIceCream();
    }

    @Override
    public SmallIceCream createSmallIceCream() {
        return new SmallAppleIceCream();
    }
}
