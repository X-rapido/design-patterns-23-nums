package com.example.Interaction_mode.中介者模式;

/**
 * 研发部门
 */
public class Development implements Department {

    private Mediator mediator;  // 持有中介者(总经理)的引用

    public Development(Mediator m) {
        this.mediator = m;
        m.register("development", this);    // 注册到中介者
    }

    @Override
    public void selfAction() {
        System.out.println("【研发部】专心科研，开发项目！");
    }

    @Override
    public void outAction() {
        System.out.println("【研发部】汇报工作！没钱了，需要资金支持！");
    }
}
