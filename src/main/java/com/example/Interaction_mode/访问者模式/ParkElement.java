package com.example.Interaction_mode.访问者模式;

/*
 * 公园每个部分的抽象
 */
public interface ParkElement {

	/**
	 * 用来接纳访问者
	 */
	void accept(Visitor visitor);

}
