package com.example.create_mode.建造者模式;

import com.example.create_mode.建造者模式.service.HouseBuilder;

/**
 * 建造设计者
 */
public class HouseDirector {

    // 建造房屋
    public void makeHouse(HouseBuilder builder) {
        builder.markBasic();
        builder.markWalls();
        builder.markRoofed();
    }

}
