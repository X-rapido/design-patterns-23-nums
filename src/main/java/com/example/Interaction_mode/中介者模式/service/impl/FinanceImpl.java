package com.example.Interaction_mode.中介者模式.service.impl;

import com.example.Interaction_mode.中介者模式.service.DepartmentService;
import com.example.Interaction_mode.中介者模式.service.MediatorService;

/**
 * 财务部门
 */
public class FinanceImpl implements DepartmentService {

	private MediatorService mediatorService;  // 持有中介者(总经理)的引用
	
	public FinanceImpl(MediatorService m) {
		this.mediatorService = m;
		mediatorService.register("financial", this);		 // 注册到中介者
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
