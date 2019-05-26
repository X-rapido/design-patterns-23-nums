package com.example.Interaction_mode.状态模式;

public class MainClass {

	public static void main(String[] args) {
		HomeContext ctx = new HomeContext();
		
		ctx.setState(new FreeState());
		ctx.setState(new BookedState());
	}
}
