package com.example.Interaction_mode.访问者模式.service.impl;


import com.example.Interaction_mode.访问者模式.service.Visitor;

/**
 * 【清洁工】访问者A，负责访问 ParkA 的卫生情况
 */
public class VisitorA implements Visitor {

	@Override
	public void visit(Park park) {

	}

	@Override
	public void visit(ParkA parkA) {
		System.out.println("清洁工A：完成公园 " + parkA.getName()+ " 的卫生");
	}

	@Override
	public void visit(ParkB parkB) {

	}

}
