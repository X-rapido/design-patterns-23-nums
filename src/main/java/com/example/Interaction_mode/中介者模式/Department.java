package com.example.Interaction_mode.中介者模式;

/**
 * 部门接口
 */
public interface Department {
    void selfAction(); // 做本部门的事情

    void outAction();  // 对外发出指令，这里指向总经理发出申请
}
