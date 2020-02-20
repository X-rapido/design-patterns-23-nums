package com.example.Interaction_mode.中介者模式;

import com.example.Interaction_mode.中介者模式.service.MediatorService;
import com.example.Interaction_mode.中介者模式.service.impl.DevelopmentImpl;
import com.example.Interaction_mode.中介者模式.service.impl.FinanceImpl;
import com.example.Interaction_mode.中介者模式.service.impl.MarketImpl;
import com.example.Interaction_mode.中介者模式.service.impl.PresidentImpl;

public class MainClass {

    public static void main(String[] args) {
        MediatorService mediatorService = new PresidentImpl();       // 总经理作为中间人

        MarketImpl marketImpl = new MarketImpl(mediatorService);          // 市场
        DevelopmentImpl devp = new DevelopmentImpl(mediatorService);      // 研发
        FinanceImpl financeImpl = new FinanceImpl(mediatorService);       // 财务

        marketImpl.selfAction();    // 做部门内事
        marketImpl.outAction();     // 对外发出指令执行，这里面调用了财务的指令

//        devp.selfAction();
//        devp.outAction();
//
//        financeImpl.selfAction();
//        financeImpl.outAction();
    }
}
