package com.example.create_mode.单例模式;

/**
 * 懒汉式(线程不安全)[不可用]
 */
public class Singleton3 {
    private static Singleton3 singleton;

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        if (singleton == null) {
            singleton = new Singleton3();
        }
        return singleton;
    }
}
