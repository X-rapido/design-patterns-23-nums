package com.example.create_mode.简单工厂模式.service.impl;

import com.example.create_mode.简单工厂模式.service.Human;

public class Man implements Human {

    @Override
    public void say() {
        System.out.println("男人");
    }

}