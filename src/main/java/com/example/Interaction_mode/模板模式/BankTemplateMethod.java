package com.example.Interaction_mode.模板模式;

/**
 * 模版抽象类
 */
public abstract class BankTemplateMethod {

	public void takeNumber(){
		System.out.println("取号排队");
	}

	/**
	 * 钩子方法
	 */
	public abstract void transact(); //办理具体的业务
	
	public void evaluate(){
		System.out.println("反馈评分");
	}

	/**
	 * 模板方法
	 */
	public final void process(){
		this.takeNumber();

		this.transact();	// 调用钩子

		this.evaluate();
	}
	
}
