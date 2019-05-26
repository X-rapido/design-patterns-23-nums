package com.example.create_mode.建造者模式;

/**
 * 工程队
 */
public interface HouseBuilder {

    /**
     * 打基础
     */
    void markBasic();

    /**
     * 砌墙
     */
    void markWalls();

    /**
     * 封顶
     */
    void markRoofed();

    /**
     * 造房子
     *
     * @return
     */
    House buildHouse();

}
