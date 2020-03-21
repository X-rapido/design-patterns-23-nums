package com.example.实例3.enums;

/**
 * 索引名字
 */
public enum IndexEnum {
    PRODUCT("product", "商品"),
    ITEM("item", "作品"),
    ARTISAN("artisan", "手艺人"),
    STUDIO("studio", "店铺");

    private String index;
    private String desc;

    IndexEnum(String index, String desc) {
        this.index = index;
        this.desc = desc;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
