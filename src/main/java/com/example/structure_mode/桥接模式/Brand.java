package com.example.structure_mode.桥接模式;

/**
 * 品牌桥接
 */
public interface Brand {
	void sale();	// 销售
}

class Lenovo implements Brand {

	@Override
	public void sale() {
		System.out.println(	"销售联想电脑");
	}
	
}

class Dell implements Brand {
	
	@Override
	public void sale() {
		System.out.println("销售Dell电脑");
	}
	
}

class Shenzhou implements Brand {
	
	@Override
	public void sale() {
		System.out.println("销售神舟电脑");
	}
	
}
