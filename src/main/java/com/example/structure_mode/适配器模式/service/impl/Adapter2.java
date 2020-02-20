package com.example.structure_mode.适配器模式.service.impl;

import com.example.structure_mode.适配器模式.Adaptee;
import com.example.structure_mode.适配器模式.service.Target;

/**
 * Adapter 适配器角色
 */
public class Adapter2 implements Target {

    private Adaptee adaptee;

    public Adapter2(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void handleReq() {
        adaptee.doSomething();
    }
}
