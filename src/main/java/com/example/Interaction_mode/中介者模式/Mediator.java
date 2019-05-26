package com.example.Interaction_mode.中介者模式;

/**
 * 中介者
 */
public interface Mediator {
    void register(String dname, Department d);  // 注册部门信息

    void command(String dname);     // 让指定同事做事
}
