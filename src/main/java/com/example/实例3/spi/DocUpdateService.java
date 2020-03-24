package com.example.实例3.spi;

import com.example.实例3.model.DocContext;

/**
 * 文档更新
 */
public interface DocUpdateService {

    /**
     * 全量更新作品
     */
    void fullImportItem();

    /**
     * 增量更新作品
     *
     * @param itemId
     */
    void updateItems(String itemId);

    /**
     * 增量更新商品下所有sku
     *
     * @param productId
     */
    void updateProduct(String productId);

    /**
     * 增量更新手艺人作品
     *
     * @param artisanId 手艺人id
     */
    void updateArtisanItems(String artisanId);

    /**
     * 全量更新手艺人
     */
    void fullImportArtisan();

    /**
     * 增量更新手艺人
     */
    void updateArtisan(String artisanId);

    /**
     * 更新内容
     *
     * @param content
     */
    void docUpdate(DocContext content);

}
