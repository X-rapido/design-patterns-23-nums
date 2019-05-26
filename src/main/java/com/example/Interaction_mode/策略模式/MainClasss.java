package com.example.Interaction_mode.策略模式;

public class MainClasss {

    public static void main(String[] args) {
        Strategy s1 = new OldCustomerManyStrategy();    // 老客户
        Context ctx = new Context(s1);          // 交互
        ctx.printPrice(998);    // 打印报价
    }
}
