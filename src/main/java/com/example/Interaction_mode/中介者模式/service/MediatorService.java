package com.example.Interaction_mode.中介者模式.service;

/**
 * 中介者
 */
public interface MediatorService {
    /**
     * 注册部门信息
     */
    void register(String dname, DepartmentService d);

    /**
     * 让指定同事做事
     */
    void command(String dname);
}
