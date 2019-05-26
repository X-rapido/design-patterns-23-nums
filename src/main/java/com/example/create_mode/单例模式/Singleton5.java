package com.example.create_mode.单例模式;

/**
 * 懒汉式(线程安全，同步代码块)[不可用]
 */
public class Singleton5 {
    private static Singleton5 singleton;

    private Singleton5() {
    }

    public static Singleton5 getInstance() {
        if (singleton == null) {
            synchronized (Singleton5.class) {
                singleton = new Singleton5();
            }
        }
        return singleton;
    }
}
