package com.example.create_mode.单例模式.test;

import com.example.create_mode.单例模式.Singleton8;
import com.google.common.base.Stopwatch;

import java.util.concurrent.CountDownLatch;

/**
 * 测试单例模式性能
 */
public class Demo2 {
    public static void main(String[] args) throws InterruptedException{

        Stopwatch stopwatch = Stopwatch.createStarted();

        int threadNum = 10;
        // 计数器
        CountDownLatch latch = new CountDownLatch(threadNum);

        // 1万次创建
        for (int i = 0; i < threadNum; i++) {
            new Thread(()->{
                for (int j = 0; j < 10000; j++) {
//                    Singleton instance = Singleton.getInstance();     // 73.79 ms 饿汉式（静态常量）[可用]
//                    Singleton2 instance = Singleton2.getInstance();   // 83.85 ms 饿汉式（静态代码块）[可用]
//                    Singleton3 instance = Singleton3.getInstance();   // 62.94 ms 懒汉式(线程不安全)[不可用]
//                    Singleton4 instance = Singleton4.getInstance();   // 84.62 ms 懒汉式(线程安全，同步方法)[不推荐用]
//                    Singleton5 instance = Singleton5.getInstance();   // 65.11 ms 懒汉式(线程安全，同步代码块)[不可用]
//                    Singleton6 instance = Singleton6.getInstance();   // 72.10 ms 双重检查[推荐用]
//                    Singleton7 instance = Singleton7.getInstance();   // 73.50 ms 静态内部类[推荐用]
                    Singleton8 instance = Singleton8.INSTANCE;          // 63.78 ms 枚举[推荐用]
                }

                latch.countDown();  // 计数器减一
            }).start();
        }

        latch.await();  // main 线程阻塞，直到计数器变为0，才会继续往下执行

        System.out.println("总耗时："+stopwatch.toString());
    }
}
