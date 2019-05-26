package com.example.structure_mode.桥接模式;

/**
 * 电脑类型的维度
 */
public class Computer2 {
	protected Brand brand;	// 品牌
	
	public Computer2(Brand b) {
		this.brand = b;
	}
	
	public void sale(){
		brand.sale();
	}
	
}

/**
 * 台式机
 */
class Desktop2 extends Computer2 {

	public Desktop2(Brand b) {
		super(b);
	}
	
	@Override
	public void sale() {
		super.sale();
		System.out.println("销售台式机");
	}
}

/**
 * 笔记本
 */
class Laptop2 extends Computer2 {
	
	public Laptop2(Brand b) {
		super(b);
	}
	
	@Override
	public void sale() {
		super.sale();
		System.out.println("销售笔记本");
	}
}

/**
 * 平板电脑
 */
class Pad2 extends Computer2 {

	public Pad2(Brand b) {
		super(b);
	}

	@Override
	public void sale() {
		super.sale();
		System.out.println("销售平板电脑");
	}
}
