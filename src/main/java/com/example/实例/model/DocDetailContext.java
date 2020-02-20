package com.example.实例.model;

import lombok.Data;

/**
 * 作品内容上下文
 */
@Data
public class DocDetailContext {

    /**
     * 作品id / skuId
     */
    private String id;

    /**
     * 作品名称
     */
    private String name;

    /**
     * 新商品id
     */
    private String newProductId;

    /**
     * 类目名称
     */
    private String category;

    /**
     * 类目id
     */
    private String categoryId;

}
