package com.example.Interaction_mode.命令模式.示例1;

import lombok.AllArgsConstructor;

/**
 * 调用者/发起者
 */
@AllArgsConstructor
public class Invoke {
	
	private Command command;   // 也可以通过容器List<Command>容纳很多命令对象，进行批处理。数据库底层的事务管理就是类似的结构！

	// 业务方法 ，调用命令类的方法
	public void call(){
		command.execute();
	}

}
