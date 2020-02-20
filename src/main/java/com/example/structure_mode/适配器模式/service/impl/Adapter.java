package com.example.structure_mode.适配器模式.service.impl;

import com.example.structure_mode.适配器模式.Adaptee;
import com.example.structure_mode.适配器模式.service.Target;

/**
 * Adapter 适配器角色
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public void handleReq() {
        super.doSomething();
    }
}
