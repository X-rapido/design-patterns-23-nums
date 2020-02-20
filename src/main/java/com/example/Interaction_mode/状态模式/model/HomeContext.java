package com.example.Interaction_mode.状态模式.model;


import com.example.Interaction_mode.状态模式.service.StateService;

/**
 * 房间对象
 */
public class HomeContext {
	// 如果是银行系统，这个 Context 类就是账号。根据金额不同，切换不同的状态！
	
	private StateService stateService;

	public void setState(StateService s){
		System.out.println("修改状态！");
		stateService = s;
		stateService.handle();
	}
	
}
