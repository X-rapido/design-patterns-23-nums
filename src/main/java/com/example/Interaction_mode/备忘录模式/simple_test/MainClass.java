package com.example.Interaction_mode.备忘录模式.simple_test;

public class MainClass {
	public static void main(String[] args) {
		Person per = new Person("程序喵","男",26);

		// 保存内部状态
		Person backup = new Person(per.getName(), per.getSex(),per.getAge());
		System.out.println(per.toString());

		// 修改
		per.setName("听风");
		per.setAge(20);
		System.out.println(per.toString());

		// 回滚，还原
		per.setName(backup.getName());
		per.setSex(backup.getSex());
		per.setAge(backup.getAge());

		System.out.println(per.toString());
	}
}
