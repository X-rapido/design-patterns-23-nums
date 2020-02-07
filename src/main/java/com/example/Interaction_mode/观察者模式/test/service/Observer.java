package com.example.Interaction_mode.观察者模式.test.service;

import com.example.Interaction_mode.观察者模式.test.Subject;

/**
 * 观察者对象 - 消息订阅
 */
public interface Observer {
	/**
	 * 更新主题对象
	 */
	void update(Subject subject);
}
