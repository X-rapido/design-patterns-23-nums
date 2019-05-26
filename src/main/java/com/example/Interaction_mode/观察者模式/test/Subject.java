package com.example.Interaction_mode.观察者模式.test;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题 - 消息发布
 */
public class Subject {

	protected List<Observer> list = new ArrayList<>();	// 观察者列表

	/**
	 * 注册观察者
	 */
	public void registerObserver(Observer obs){
		list.add(obs);
	}

	/**
	 * 移除观察者
	 */
	public void removeObserver(Observer obs){
		list.add(obs);
	}

	/**
	 * 通知所有的观察者更新状态
	 */
	public void notifyAllObservers(){
		for (Observer obs : list) {
			obs.update(this);
		}
	}
	
}
