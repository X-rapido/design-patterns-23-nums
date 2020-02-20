package com.example.Interaction_mode.中介者模式.service.impl;

import com.example.Interaction_mode.中介者模式.service.DepartmentService;
import com.example.Interaction_mode.中介者模式.service.MediatorService;

/**
 * 市场部
 */
public class MarketImpl implements DepartmentService {

	private MediatorService mediatorService;  // 持有中介者(总经理)的引用
	
	public MarketImpl(MediatorService m) {
		this.mediatorService = m;
		m.register("market", this);	 // 注册到中介者
	}

	@Override
	public void outAction() {
		System.out.println("【市场部】汇报工作！项目承接的进度，需要资金支持！");
		mediatorService.command("financial");	// 通过中介者，调用财务接口
	}

	@Override
	public void selfAction() {
		System.out.println("【市场部】跑去接项目！");
	}

}
