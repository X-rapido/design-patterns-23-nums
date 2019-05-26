package com.example.structure_mode.代理模式.静态代理;

/**
 * 真实角色
 */
public class You implements Marry{

    @Override
    public void marry() {
        System.out.println("我和小仙女结婚了...");
    }

}