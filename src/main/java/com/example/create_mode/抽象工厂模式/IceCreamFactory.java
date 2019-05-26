package com.example.create_mode.抽象工厂模式;

/**
 * 冰激凌工厂接口
 */
public interface IceCreamFactory {

    BigIceCream createBigIceCream();
    SmallIceCream createSmallIceCream();

}
