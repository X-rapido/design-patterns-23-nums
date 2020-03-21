package com.example.实例3.spi;

import com.example.实例3.enums.IndexEnum;
import com.example.实例3.model.DocEntity;

/**
 * 数据映射，可以映射到 Solr，ElasticSearch 等
 */
public interface DocMappingService {

    /**
     * K,V 字段映射到 Solr doc 文档
     *
     * @param indexEnum 索引名
     * @param entity    索引数据
     */
    void solrMapping(IndexEnum indexEnum, DocEntity entity);

    /**
     * K,V 字段映射到 ElasticSearch doc 文档
     */
    void esMapping(IndexEnum indexEnum, DocEntity entity);

}
