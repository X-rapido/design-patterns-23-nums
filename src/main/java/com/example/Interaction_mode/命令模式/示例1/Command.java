package com.example.Interaction_mode.命令模式.示例1;

import lombok.AllArgsConstructor;

/**
 * 命令抽象类
 */
public interface Command {

	void execute();
}

/**
 * 命令实现类
 */
@AllArgsConstructor
class ConcreteCommand implements Command {

	/**
	 * 执行者
	 */
	private Receiver receiver;

	@Override
	public void execute() {
		// 命令执行前或后，执行相关的处理！
		System.out.println("命令执行前...");
		receiver.action();
		System.out.println("命令执行后...");
	}
	
}