package com.example.Interaction_mode.中介者模式.service;

/**
 * 部门接口
 */
public interface DepartmentService {
    /**
     * 做本部门的事情
     */
    void selfAction();

    /**
     * 对外发出指令，这里指向总经理发出申请
     */
    void outAction();
}
