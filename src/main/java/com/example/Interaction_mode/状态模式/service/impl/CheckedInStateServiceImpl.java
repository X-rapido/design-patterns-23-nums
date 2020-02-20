package com.example.Interaction_mode.状态模式.service.impl;

import com.example.Interaction_mode.状态模式.service.StateService;

/**
 * 已入住状态
 */
public class CheckedInStateServiceImpl implements StateService {

	@Override
	public void handle() {
		System.out.println("房间已入住！请勿打扰！");
	}

}
