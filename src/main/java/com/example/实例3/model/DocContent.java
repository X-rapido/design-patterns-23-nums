package com.example.实例3.model;

import com.example.实例3.enums.IndexEnum;
import com.example.实例3.enums.IndexTypeEnum;
import lombok.Data;

/**
 * doc上下文
 */
@Data
public class DocContent {
    /**
     * 索引名字
     */
    private IndexEnum index;

    /**
     * 索引类别
     */
    private IndexTypeEnum type;

    /**
     * 索引 id，增量更新用
     * 作品 -> itemId
     * 商品 -> productId
     * 手艺人 -> artisanId
     * 工作室 -> studioId
     */
    private String id;

    /**
     * hander执行请求参数
     */
    private DocParam docParam;

}
