package com.example.Interaction_mode.备忘录模式;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * 源发器类
 */
@Data
@AllArgsConstructor
@ToString
public class Person {
    private String name;
    private String sex;
    private int age;

    /**
     * 创建备份
     */
    public Memento createMemento() {
        return new Memento(name, sex, age);
    }

    /**
     * 还原备份
     */
    public void setMemento(Memento memento) {
        this.name = memento.getName();
        this.sex = memento.getSex();
        this.age = memento.getAge();
    }

}
