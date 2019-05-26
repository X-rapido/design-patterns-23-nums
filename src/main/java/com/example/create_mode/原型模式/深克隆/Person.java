package com.example.create_mode.原型模式.深克隆;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

/**
 * 实现 Cloneable 接口，重写 clone 方法
 *
 * 深度克隆：需要注意引用类型对象，需要重写 clone
 */
@Data
@Accessors(chain = true)
public class Person implements Cloneable {
    private String name;
    private int age;
    private String sex;
    private List<String> friends;   // 增加一个引用的对象

    @Override
    protected Person clone() {
        try {
            Person clone = (Person) super.clone();
            List<String> fr = new ArrayList<>();
            friends.forEach(f -> fr.add(f));
            clone.setFriends(fr);
            return clone;
//            return (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
