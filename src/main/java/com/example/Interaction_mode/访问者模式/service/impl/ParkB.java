package com.example.Interaction_mode.访问者模式.service.impl;

import com.example.Interaction_mode.访问者模式.service.ParkElement;
import com.example.Interaction_mode.访问者模式.service.Visitor;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 公园B
 */
@Data
@AllArgsConstructor
public class ParkB implements ParkElement {
	private String name;

	@Override
    public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
