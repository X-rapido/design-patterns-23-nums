package com.example.Interaction_mode.观察者模式.jdk_test;

public class MainClass {
    public static void main(String[] args) {

        // 博主，三个观察者
        BlogUser user = new BlogUser();
        user.addObserver(new MyOb_A_Server());
        user.addObserver(new MyOb_B_Server());

        user.deleteObserver(new MyOb_A_Server());

        System.out.println("观察者数量：" + user.countObservers());

        user.publishBlog("HelloWorld", "这是一条使用 java 代码编写的 HelloWorld 文章\n");
    }
}
