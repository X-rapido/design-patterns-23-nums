package com.example.Interaction_mode.中介者模式.service.impl;

import com.example.Interaction_mode.中介者模式.service.DepartmentService;
import com.example.Interaction_mode.中介者模式.service.MediatorService;

import java.util.HashMap;
import java.util.Map;

/**
 * 总经理
 */
public class PresidentImpl implements MediatorService {

    private Map<String, DepartmentService> map = new HashMap<>();  // 维持几个部门列表

    @Override
    public void register(String dname, DepartmentService d) {
        map.put(dname, d);
    }

    @Override
    public void command(String dname) {
        map.get(dname).selfAction();
    }

}
