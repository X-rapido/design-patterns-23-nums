package com.example.Interaction_mode.责任链模式;

public class MainClass {

    public static void main(String[] args) {
        Leader a = new Director("张三");      // 主任
        Leader b = new Manager("李四");       // 经理
        Leader c = new ViceGeneralManager("李小四");  // 副总经理
        Leader d = new GeneralManager("王五");         // 总经理

        // 组织责任链对象的关系
        a.setNextLeader(b);
        b.setNextLeader(c);
        c.setNextLeader(d);

        // 开始请假操作
        LeaveRequest req = new LeaveRequest("汤姆", 15, "回英国老家探亲！");
        a.handleRequest(req);
    }
}
