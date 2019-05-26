package com.example.Interaction_mode.中介者模式;

import java.util.HashMap;
import java.util.Map;

/**
 * 总经理
 */
public class President implements Mediator {

    private Map<String, Department> map = new HashMap<>();  // 维持几个部门列表

    @Override
    public void register(String dname, Department d) {
        map.put(dname, d);
    }

    @Override
    public void command(String dname) {
        map.get(dname).selfAction();
    }

}
