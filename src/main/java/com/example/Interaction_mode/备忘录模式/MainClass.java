package com.example.Interaction_mode.备忘录模式;

public class MainClass {
    public static void main(String[] args) {
        Person per = new Person("程序喵", "二次元", 20);
        System.out.println(per.toString());

        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(per.createMemento());  // 创建备份

        // 修改
        per.setName("听风");
        per.setSex("男");
        per.setAge(26);
        System.out.println(per.toString());

        per.setMemento(caretaker.getMemento());     // 恢复备份
        System.out.println(per.toString());

    }
}
