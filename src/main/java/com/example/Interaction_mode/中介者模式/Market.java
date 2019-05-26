package com.example.Interaction_mode.中介者模式;

/**
 * 市场部
 */
public class Market implements Department {

	private Mediator mediator;  // 持有中介者(总经理)的引用
	
	public Market(Mediator m) {
		this.mediator = m;
		m.register("market", this);	 // 注册到中介者
	}

	@Override
	public void outAction() {
		System.out.println("【市场部】汇报工作！项目承接的进度，需要资金支持！");
		mediator.command("financial");	// 通过中介者，调用财务接口
	}

	@Override
	public void selfAction() {
		System.out.println("【市场部】跑去接项目！");
	}

}
