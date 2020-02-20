package com.example.Interaction_mode.访问者模式;

import com.example.Interaction_mode.访问者模式.service.impl.*;

public class MainClass {

    public static void main(String[] args) {
        Park park = new Park();
        park.setName("东1时区公园");
        park.setParkA(new ParkA("A"));  // 清洁工 A
        park.setParkB(new ParkB("B"));  // 清洁工 B

        park.accept(new VisitorA());
        park.accept(new VisitorB());
        park.accept(new VisitorManager());
    }
}
