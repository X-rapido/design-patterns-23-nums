package com.example.create_mode.单例模式.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * 使用反射破解单例私有
 * 使用反序列化破解单例私有
 */
public class Demo1 {
    public static void main(String[] args) throws Exception {
        SingletonDemo s1 = SingletonDemo.getInstance();
        SingletonDemo s2 = SingletonDemo.getInstance();

        System.out.println("s1 " + s1);
        System.out.println("s2 " + s2);

        // 通过反射方式直接调用私有
        Class<SingletonDemo> clazz = (Class<SingletonDemo>) Class.forName("com.example.create_mode.单例模式.test.SingletonDemo");
        Constructor<SingletonDemo> c = clazz.getDeclaredConstructor(null);
        c.setAccessible(true);
        SingletonDemo s3 = c.newInstance();
        SingletonDemo s4 = c.newInstance();
        System.out.println("s3 " + s3);
        System.out.println("s4 " + s4);

        // 通过反序列化构建多个对象
        FileOutputStream fos = new FileOutputStream("/Users/liurenkui/workSpace/a.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s1);
        oos.close();
        fos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/liurenkui/workSpace/a.txt"));
        SingletonDemo s5 = (SingletonDemo) ois.readObject();
        System.out.println("s5 " + s5);
    }
}
