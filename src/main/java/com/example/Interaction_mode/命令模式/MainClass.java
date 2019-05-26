package com.example.Interaction_mode.命令模式;

public class MainClass {

	public static void main(String[] args) {

		Command command = new ConcreteCommand(new Receiver());	// 实现类
		Invoke invoke = new Invoke(command);
		invoke.call();		// 调用

//		new Receiver().action();
	}
}
