package com.example.create_mode.原型模式.深克隆;

import com.google.common.collect.Lists;

/**
 * 深度克隆示例
 */
public class MainClass {

    public static void main(String[] args) {
        Person p = new Person()
                .setName("程序喵")
                .setAge(3)
                .setSex("男")
                .setFriends(Lists.newArrayList("杰克", "玛丽", "马科斯"));

        Person p2 = p.clone();   // 执行clone复制

        System.out.println(p.getFriends());
        System.out.println(p2.getFriends());

        p.getFriends().add("丽萨");   // 新增朋友，如果不重写clone方法的引用对象，则修改一处，其他也有变化（统一块儿引用）

        System.out.println(p.getFriends());
        System.out.println(p2.getFriends());
    }
}
