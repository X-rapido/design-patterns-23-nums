package com.example.Interaction_mode.策略模式;

/**
 * 普通客户小批量策略
 */
public class CustomerFewStrategy implements Strategy {

	@Override
	public double getPrice(double standardPrice) {
		System.out.println("不打折，原价");
		return standardPrice;
	}

}
