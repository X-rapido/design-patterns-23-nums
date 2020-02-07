package com.example.create_mode.简单工厂模式;

import com.example.create_mode.简单工厂模式.service.Human;
import com.example.create_mode.简单工厂模式.service.impl.Man;
import com.example.create_mode.简单工厂模式.service.impl.Woman;

/**
 * 简单工程模式，通过反射实现：传递类
 */
public class SampleFactory1 {
    public static Human makeHuman(Class c) {
        Human human = null;
        try {
            human = (Human) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            System.out.println("不支持抽象类或接口");
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            System.out.println("没有足够权限，即不能访问私有对象");
        } catch (ClassNotFoundException e) {
            System.out.println("类不存在");
            e.printStackTrace();
        }
        return human;
    }

    public static void main(String[] args) {
        Human man = SampleFactory1.makeHuman(Man.class);
        man.say();

        Human woman = SampleFactory1.makeHuman(Woman.class);
        woman.say();
    }
}
