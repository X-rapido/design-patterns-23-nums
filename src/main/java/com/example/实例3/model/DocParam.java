package com.example.实例3.model;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 公共请求参数
 */
@Data
@Accessors(chain = true)
public class DocParam {

    /**
     * skuId
     */
    private String itemId;

    /**
     * 作品名称
     */
    private String name;

    /**
     * 新商品id
     */
    private String newProductId;

    /**
     * 手艺人id
     */
    private String artisanId;

    /**
     * studioId
     */
    private String studioId;

    /**
     * 类目名称
     */
    private String category;

    /**
     * 类目id
     */
    private String categoryId;

}
