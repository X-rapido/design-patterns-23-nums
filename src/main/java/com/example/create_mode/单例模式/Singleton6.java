package com.example.create_mode.单例模式;

/**
 * 双重检查[推荐用]
 */
public class Singleton6 {
    private static volatile Singleton6 singleton;

    private Singleton6() {
    }

    public static Singleton6 getInstance() {
        if (singleton == null) {
            synchronized (Singleton6.class) {
                if (singleton == null) {
                    singleton = new Singleton6();
                }
            }
        }
        return singleton;
    }
}
