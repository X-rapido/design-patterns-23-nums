package com.example.Interaction_mode.访问者模式;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 公园B
 */
@Data
@AllArgsConstructor
public class ParkB implements ParkElement{
	private String name;

	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
