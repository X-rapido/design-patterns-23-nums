package com.example.create_mode.单例模式;

/**
 * 饿汉式（静态常量）[可用]
 */
public class Singleton {
    private final static Singleton INSTANCE = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return INSTANCE;
    }
}
