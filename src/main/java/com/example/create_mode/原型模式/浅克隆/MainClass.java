package com.example.create_mode.原型模式.浅克隆;

public class MainClass {

    public static void main(String[] args) {
        Person p = new Person().setName("程序喵").setAge(3).setSex("男");

        Person p2 = p.clone();   // 执行clone复制
        p2.setName("听风");       // 设置值不会对 p 有影响

        System.out.println(p.getName());
        System.out.println(p2.getName());
    }
}
