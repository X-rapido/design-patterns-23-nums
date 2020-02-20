package com.example.Interaction_mode.状态模式;

import com.example.Interaction_mode.状态模式.model.HomeContext;
import com.example.Interaction_mode.状态模式.service.impl.BookedStateServiceImpl;
import com.example.Interaction_mode.状态模式.service.impl.FreeStateServiceImpl;

public class MainClass {

	public static void main(String[] args) {
		HomeContext ctx = new HomeContext();
		
		ctx.setState(new FreeStateServiceImpl());
		ctx.setState(new BookedStateServiceImpl());
	}
}
