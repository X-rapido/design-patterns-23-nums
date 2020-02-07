package com.example.create_mode.建造者模式.service.impl;

import com.example.create_mode.建造者模式.model.House;
import com.example.create_mode.建造者模式.service.HouseBuilder;

/**
 * 客栈建造
 */
public class InnBuilder implements HouseBuilder {
    private House house;

    public InnBuilder() {
        house = new House();
    }

    @Override
    public void markBasic() {
        house.setBasic("客栈 -> 打好基础");
    }

    @Override
    public void markWalls() {
        house.setWall("客栈 -> 砌墙");
    }

    @Override
    public void markRoofed() {
        house.setRoofed("客栈 -> 封顶大吉");
    }

    @Override
    public House buildHouse() {
        return house;
    }
}
