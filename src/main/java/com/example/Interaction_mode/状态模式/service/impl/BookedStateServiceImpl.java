package com.example.Interaction_mode.状态模式.service.impl;

import com.example.Interaction_mode.状态模式.service.StateService;

/**
 * 已预订状态
 */
public class BookedStateServiceImpl implements StateService {

	@Override
	public void handle() {
		System.out.println("房间已预订！别人不能定！");
	}

}
