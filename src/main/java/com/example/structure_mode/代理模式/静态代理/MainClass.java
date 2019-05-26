package com.example.structure_mode.代理模式.静态代理;

/**
 * 静态代理：设计模式
 * 1、真实对象
 * 2、代理角色
 * 3、两则实现相同的接口
 */
public class MainClass {

    public static void main(String[] args) {
        // 真实角色
        Marry you = new You();
        // 代理角色 + 真实角色引用
        WeddingProxy proxy = new WeddingProxy(you);
        // 执行代理方法
        proxy.marry();
    }
}
