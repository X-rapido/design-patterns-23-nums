package com.example.create_mode.原型模式.浅克隆;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 实现 Cloneable 接口，重写 clone 方法
 */
@Data
@Accessors(chain = true)
public class Person implements Cloneable {
    private String name;
    private int age;
    private String sex;

    @Override
    protected Person clone() {
        try {
            return (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
