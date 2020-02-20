package com.example.Interaction_mode.访问者模式.service.impl;

import com.example.Interaction_mode.访问者模式.service.Visitor;

/**
 * 访问者 - 管理员
 */
public class VisitorManager implements Visitor {

    public void visit(Park park) {
        System.out.println("管理员：负责 " + park.getName() + " 卫生检查");
    }

    public void visit(ParkA parkA) {
        System.out.println("管理员：负责 " + parkA.getName() + " 部分卫生检查");
    }

    public void visit(ParkB parkB) {
        System.out.println("管理员：负责 " + parkB.getName() + " 部分卫生检查");
    }

}
