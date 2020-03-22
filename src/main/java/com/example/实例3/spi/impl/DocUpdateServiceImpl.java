package com.example.实例3.spi.impl;

import com.example.实例3.enums.IndexEnum;
import com.example.实例3.enums.IndexTypeEnum;
import com.example.实例3.handler.BaseContext;
import com.example.实例3.handler.DocHandler;
import com.example.实例3.handler.impl.*;
import com.example.实例3.model.DocContent;
import com.example.实例3.model.DocEntity;
import com.example.实例3.model.DocParam;
import com.example.实例3.model.DocStrategy;
import com.example.实例3.spi.DocMappingService;
import com.example.实例3.spi.DocUpdateService;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DocUpdateServiceImpl extends BaseContext implements DocUpdateService {

    private DocMappingService mappingService = new DocMappingSericeImpl();

    @Override
    public void fullImportItem() {
        // 上下文
        DocContent content = new DocContent();
        content.setIndex(IndexEnum.ITEM);
        content.setType(IndexTypeEnum.FULL_UPDATE);

        // 执行更新
        this.docUpdate(content);
    }

    @Override
    public void updateItems(String itemId) {
        // 上下文
        DocContent content = new DocContent();
        content.setIndex(IndexEnum.ITEM);
        content.setType(IndexTypeEnum.UPDATE);
        content.setDocParam(new DocParam().setItemId(itemId));

        // 执行
        this.docUpdate(content);
    }

    @Override
    public void updateProduct(String productId) {
        // 上下文
        DocContent content = new DocContent();
        content.setIndex(IndexEnum.ITEM);
        content.setType(IndexTypeEnum.UPDATE);
        content.setDocParam(new DocParam().setNewProductId(productId));

        // 执行
        this.docUpdate(content);
    }
    @Override
    public void updateArtisanItems(String artisanId) {
        // 上下文
        DocContent content = new DocContent();
        content.setIndex(IndexEnum.ITEM);
        content.setType(IndexTypeEnum.UPDATE);
        content.setDocParam(new DocParam().setArtisanId(artisanId));

        // 执行
        this.docUpdate(content);
    }

    @Override
    public void fullImportArtisan() {
        // 上下文
        DocContent content = new DocContent();
        content.setIndex(IndexEnum.ARTISAN);
        content.setType(IndexTypeEnum.FULL_UPDATE);

        // 执行
        this.docUpdate(content);
    }

    @Override
    public void updateArtisan(String artisanId) {
        // 上下文
        DocContent content = new DocContent();
        content.setIndex(IndexEnum.ARTISAN);
        content.setType(IndexTypeEnum.FULL_UPDATE);
        content.setDocParam(new DocParam().setArtisanId(artisanId));

        // 执行
        this.docUpdate(content);
    }

    @Override
    public void docUpdate(DocContent content) {
        if (IndexTypeEnum.FULL_UPDATE.equals(content.getType())) {
            // 初始化全量数据
            if (CollectionUtils.isEmpty(allCitys) || CollectionUtils.isEmpty(allArtisanId)){
                this.init();
            }

            if (IndexEnum.ITEM.equals(content.getIndex())) {
                if (!CollectionUtils.isEmpty(allArtisanId)) {
                    for (String id : allArtisanId) {
                        List<DocStrategy> strategyList = getDocStrategyList(content.getIndex());
                        content.setDocParam(new DocParam().setArtisanId(id));
                        this.exec(content, strategyList);
                    }
                }

            } else if (IndexEnum.ARTISAN.equals(content.getIndex())) {
                if (!CollectionUtils.isEmpty(allArtisanId)) {
                    for (String id : allArtisanId) {
                        List<DocStrategy> strategyList = getDocStrategyList(content.getIndex());
                        content.setDocParam(new DocParam().setArtisanId(id));
                        this.exec(content, strategyList);
                    }
                }
            } else if (IndexEnum.STUDIO.equals(content.getIndex())) {
                if (!CollectionUtils.isEmpty(allStudioId)) {
                    for (String id : allStudioId) {
                        List<DocStrategy> strategyList = getDocStrategyList(content.getIndex());
                        content.setDocParam(new DocParam().setStudioId(id));
                        this.exec(content, strategyList);
                    }
                }
            }

        } else if (IndexTypeEnum.UPDATE.equals(content.getType())) {
            // 增量
            List<DocStrategy> strategyList = getDocStrategyList(content.getIndex());
            this.exec(content, strategyList);
        }
    }

    /**
     * 获取执行策略
     * @param indexEnum 索引名称
     * @return
     */
    private List<DocStrategy> getDocStrategyList(IndexEnum indexEnum) {
        List<DocStrategy> strategyList = new ArrayList<>();

        if (IndexEnum.ITEM.getIndex().equals(indexEnum.getIndex())) {
            strategyList.add(new DocStrategy(new ItemBaseHandler(), "item_base"));           // 作品-基础信息
            strategyList.add(new DocStrategy(new ItemGoldCardHandler(), "item_goldCard"));   // 作品-小金卡
            strategyList.add(new DocStrategy(new ItemArtisanHandler(), "item_artisan"));     // 作品-手艺人

        } else if (IndexEnum.ARTISAN.getIndex().equals(indexEnum.getIndex())) {
            strategyList.add(new DocStrategy(new ArtisanBaseHandler(), "artisan_base"));       // 手艺人-基本信息
            strategyList.add(new DocStrategy(new ArtisanStudioHandler(), "artisan_studio"));   // 手艺人-店铺信息

        } else if (IndexEnum.STUDIO.getIndex().equals(indexEnum.getIndex())) {
            strategyList.add(new DocStrategy(new StudioBaseHandler(), "studio_base"));        // 店铺-基本信息

        }
        return strategyList;
    }


    /**
     * 执行更新动作
     *
     * @param content      上下文
     * @param strategyList 策略列表
     */
    private void exec(DocContent content, List<DocStrategy> strategyList) {
        DocEntity entity = new DocEntity();
        strategyList.forEach(s -> {
            DocHandler handler = s.getDocHandler();
            Map<String, Object> result = handler.execute(content.getDocParam());

            // 判断重复属性
            result.forEach((k, v) -> {
                if (entity.getVars().containsKey(k)) {
                    if (!entity.getVars().get(k).equals(v)) {
                        System.out.println(String.format("更新类型：%s，索引：%s，节点：%s，K 重复 [%s]，V 不相等替换：[%s -> %s]", content.getType(), content.getIndex(), s.getAttrName(), k, entity.getVars().get(k), v));
                    }
                }
            });

            // 填充字段对象
            entity.getVars().putAll(result);
        });

        entity.getVars().forEach((k, v) -> System.out.println(k + ": " + v));

        // 更新文档数据
        mappingService.solrMapping(content.getIndex(), entity);
    }

}
