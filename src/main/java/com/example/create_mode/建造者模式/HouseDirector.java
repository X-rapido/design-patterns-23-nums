package com.example.create_mode.建造者模式;

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
