package com.example.Interaction_mode.观察者模式.test;

/**
 * 主题具体实现
 */
public class ConcreteSubject extends Subject {
	
	private int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		// 主题对象(目标对象)值发生了变化，请通知所有的观察者
		this.notifyAllObservers();
	}
	
}
