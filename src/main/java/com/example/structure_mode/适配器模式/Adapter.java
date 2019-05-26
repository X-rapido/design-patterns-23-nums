package com.example.structure_mode.适配器模式;

/**
 * Adapter 适配器角色
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public void handleReq() {
        super.doSomething();
    }
}
