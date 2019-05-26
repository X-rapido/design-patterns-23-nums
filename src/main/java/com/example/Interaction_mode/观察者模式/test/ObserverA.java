package com.example.Interaction_mode.观察者模式.test;

import lombok.Data;

/**
 * 订阅者A
 */
@Data
public class ObserverA implements Observer {

	private int myState;   // myState需要跟目标对象的state值保持一致！
	
	@Override
	public void update(Subject subject) {
		myState = ((ConcreteSubject)subject).getState();
	}

}
