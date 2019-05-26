package com.example.Interaction_mode.中介者模式;

/**
 * 财务部门
 */
public class Finance implements Department {

	private Mediator mediator;  // 持有中介者(总经理)的引用
	
	public Finance(Mediator m) {
		this.mediator = m;
		mediator.register("financial", this);		 // 注册到中介者
	}

	@Override
	public void outAction() {
		System.out.println("【财务部】汇报工作！没钱了，钱太多了！怎么花?");
	}

	@Override
	public void selfAction() {
		System.out.println("【财务部】数钱！");
	}

}
