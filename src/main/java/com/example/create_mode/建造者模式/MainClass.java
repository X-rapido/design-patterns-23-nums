package com.example.create_mode.建造者模式;

import com.example.create_mode.建造者模式.model.House;
import com.example.create_mode.建造者模式.service.HouseBuilder;
import com.example.create_mode.建造者模式.service.impl.InnBuilder;
import com.example.create_mode.建造者模式.service.impl.VillaHouseBuilder;

public class MainClass {
    public static void main(String[] args) {
        // 1、工程队来建造
//        HouseBuilder builder = new VillaHouseBuilder();
//        builder.markBasic();
//        builder.markWalls();
//        builder.markRoofed();
//        House house = builder.buildHouse();

        // 要建造的别墅
        HouseBuilder builder = new VillaHouseBuilder();
        // 2、设计师来做
        HouseDirector director = new HouseDirector();
        director.makeHouse(builder);

        House house = builder.buildHouse();
        System.out.println(house.getBasic());
        System.out.println(house.getWall());
        System.out.println(house.getRoofed());

        // 要建造的客栈
        builder = new InnBuilder();
        // 2、设计师来做
        director = new HouseDirector();
        director.makeHouse(builder);

        house = builder.buildHouse();
        System.out.println(house.getBasic());
        System.out.println(house.getWall());
        System.out.println(house.getRoofed());
    }
}
