package com.example.Interaction_mode.状态模式.service.impl;

import com.example.Interaction_mode.状态模式.service.StateService;

/**
 * 空闲状态
 */
public class FreeStateServiceImpl implements StateService {

	@Override
	public void handle() {
		System.out.println("房间空闲！！！没人住！");
	}

}
