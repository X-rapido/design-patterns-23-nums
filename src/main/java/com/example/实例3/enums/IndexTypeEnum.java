package com.example.实例3.enums;

/**
 * 索引类型
 */
public enum IndexTypeEnum {
    FULL_UPDATE("fullUpdate", "全量更新"),
    UPDATE("update", "增量更新");

    private String type;
    private String desc;

    IndexTypeEnum(String type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
