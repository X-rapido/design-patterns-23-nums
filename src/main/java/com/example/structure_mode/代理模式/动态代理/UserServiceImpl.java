package com.example.structure_mode.代理模式.动态代理;

/**
 * 目标对象
 */
public class UserServiceImpl implements UserService {

    public void add() {
        System.out.println("----------------执行添加方法---------------");
    }
}