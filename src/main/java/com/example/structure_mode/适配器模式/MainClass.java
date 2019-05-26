package com.example.structure_mode.适配器模式;

public class MainClass {
    public static void main(String[] args) {
        // 原有的业务逻辑
        Target target = new ConcreteTarget();
        target.handleReq();

        // 1、类适配器
        Target target2 = new Adapter();
        target2.handleReq();

        // 2、对象适配器
        Adaptee ee = new Adaptee();
        Adapter2 target3 = new Adapter2(ee);
        target3.handleReq();
    }
}
