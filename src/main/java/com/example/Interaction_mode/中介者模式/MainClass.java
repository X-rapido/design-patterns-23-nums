package com.example.Interaction_mode.中介者模式;

public class MainClass {

    public static void main(String[] args) {
        Mediator mediator = new President();       // 总经理作为中间人

        Market market = new Market(mediator);          // 市场
        Development devp = new Development(mediator);  // 研发
        Finance finance = new Finance(mediator);       // 财务

        market.selfAction();    // 做部门内事
        market.outAction();     // 对外发出指令执行，这里面调用了财务的指令
    }
}
