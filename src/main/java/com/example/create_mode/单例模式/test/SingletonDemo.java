package com.example.create_mode.单例模式.test;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 饿汉式（静态常量）[可用] - 可序列化
 */
public class SingletonDemo implements Serializable {
    private final static SingletonDemo instance = new SingletonDemo();

    private SingletonDemo(){
        if (instance !=null){
            throw new RuntimeException("不允许重复创建实例");
        }
    }

    public static SingletonDemo getInstance(){
        return instance;
    }

    // 反序列化时，定义了 readResolve 方法，则返回此方法，就不是单独再创建对象了
    private Object readResolve() throws ObjectStreamException{
        return instance;
    }
}
