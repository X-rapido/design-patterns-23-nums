package com.example.create_mode.建造者模式;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 具体的产品---房子
 */
@Data
@Accessors(chain = true)
public class House {
    private String basic;   // 地基
    private String wall;    // 墙
    private String roofed;  // 楼顶

}
