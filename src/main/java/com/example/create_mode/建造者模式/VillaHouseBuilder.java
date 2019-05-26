package com.example.create_mode.建造者模式;

/**
 * 别墅建造
 */
public class VillaHouseBuilder implements HouseBuilder {

    private House house;

    public VillaHouseBuilder() {
        house = new House();
    }

    @Override
    public void markBasic() {
        house.setBasic("别墅 -> 打好基础");
    }

    @Override
    public void markWalls() {
        house.setWall("别墅 -> 砌墙");
    }

    @Override
    public void markRoofed() {
        house.setRoofed("别墅 -> 封顶大吉");
    }

    @Override
    public House buildHouse() {
        return house;
    }

}