package com.example.Interaction_mode.责任链模式;

/**
 * 抽象类
 */
public abstract class Leader {
    protected String name;
    protected Leader nextLeader; // 责任链上的后继对象

    public Leader(String name) {
        this.name = name;
    }

    public void setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }


    /**
     * 处理请求 - 核心的业务方法
     */
    public abstract void handleRequest(LeaveRequest request);

}
