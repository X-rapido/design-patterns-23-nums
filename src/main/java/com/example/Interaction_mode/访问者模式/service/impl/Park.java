package com.example.Interaction_mode.访问者模式.service.impl;

import com.example.Interaction_mode.访问者模式.service.ParkElement;
import com.example.Interaction_mode.访问者模式.service.Visitor;
import lombok.Data;

/**
 * 公园
 */
@Data
public class Park implements ParkElement {
	private String name;	// 名称
	private ParkA parkA;	// 公园A
	private ParkB parkB;	// 公园B

	@Override
    public void accept(Visitor visitor) {
		visitor.visit(this);
		parkA.accept(visitor);
		parkB.accept(visitor);
	}
}
