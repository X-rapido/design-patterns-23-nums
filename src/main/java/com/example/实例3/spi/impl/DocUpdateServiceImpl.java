package com.example.实例3.spi.impl;

import com.example.实例3.enums.IndexEnum;
import com.example.实例3.enums.IndexTypeEnum;
import com.example.实例3.model.DocContent;
import com.example.实例3.model.DocParam;
import com.example.实例3.spi.DocService;
import com.example.实例3.spi.DocUpdateService;

public class DocUpdateServiceImpl implements DocUpdateService {

//    @Autowired
//    private DocService service;
    private DocService service = new DocServiceImpl();

    @Override
    public void fullImportItem() {
        // 上下文
        DocContent content = new DocContent();
        content.setIndex(IndexEnum.ITEM);
        content.setType(IndexTypeEnum.FULL_UPDATE);

        // 执行更新
        service.docUpdate(content);
    }

    @Override
    public void updateItems(String itemId) {
        // 上下文
        DocContent content = new DocContent();
        content.setIndex(IndexEnum.ITEM);
        content.setType(IndexTypeEnum.UPDATE);
        content.setDocParam(new DocParam().setItemId(itemId));

        // 执行
        service.docUpdate(content);
    }

    @Override
    public void updateProduct(String productId) {
        // 上下文
        DocContent content = new DocContent();
        content.setIndex(IndexEnum.ITEM);
        content.setType(IndexTypeEnum.UPDATE);
        content.setDocParam(new DocParam().setNewProductId(productId));

        // 执行
        service.docUpdate(content);
    }
    @Override
    public void updateArtisanItems(String artisanId) {
        // 上下文
        DocContent content = new DocContent();
        content.setIndex(IndexEnum.ITEM);
        content.setType(IndexTypeEnum.UPDATE);
        content.setDocParam(new DocParam().setArtisanId(artisanId));

        // 执行
        service.docUpdate(content);
    }

    @Override
    public void fullImportArtisan() {
        // 上下文
        DocContent content = new DocContent();
        content.setIndex(IndexEnum.ARTISAN);
        content.setType(IndexTypeEnum.FULL_UPDATE);

        // 执行
        service.docUpdate(content);
    }

    @Override
    public void updateArtisan(String artisanId) {
        // 上下文
        DocContent content = new DocContent();
        content.setIndex(IndexEnum.ARTISAN);
        content.setType(IndexTypeEnum.FULL_UPDATE);
        content.setDocParam(new DocParam().setArtisanId(artisanId));

        // 执行
        service.docUpdate(content);
    }

}
