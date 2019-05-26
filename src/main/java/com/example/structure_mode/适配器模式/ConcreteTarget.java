package com.example.structure_mode.适配器模式;

public class ConcreteTarget implements Target {

    @Override
    public void handleReq() {
        System.out.println("具体目标实现");
    }
}