package com.example.create_mode.简单工厂模式;

import com.example.create_mode.简单工厂模式.service.Human;
import com.example.create_mode.简单工厂模式.service.impl.Man;
import com.example.create_mode.简单工厂模式.service.impl.Woman;

/**
 * 简单工程模式：传递名称
 */
public class SampleFactory {

    public static Human makeHuman(String type) {
        if (type.equals("man")) {
            Human man = new Man();
            return man;
        } else if (type.equals("woman")) {
            Human woman = new Woman();
            return woman;
        } else {
            System.out.println("生产不出来");
            return null;
        }
    }

    public static void main(String[] args) {
        Human man = SampleFactory.makeHuman("man");
        man.say();

        Human womman = SampleFactory.makeHuman("woman");
        womman.say();

    }
}


