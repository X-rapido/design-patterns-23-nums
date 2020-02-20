package com.example.Interaction_mode.访问者模式.service.impl;

import com.example.Interaction_mode.访问者模式.service.Visitor;

/**
 * 【清洁工】访问者B，负责访问 ParkA 的卫生情况
 */
public class VisitorB implements Visitor {

	public void visit(Park park) {

	}

	public void visit(ParkA parkA) {

	}

	public void visit(ParkB parkB) {
		System.out.println("清洁工B：完成公园 " + parkB.getName()+ " 的卫生");
	}

}
