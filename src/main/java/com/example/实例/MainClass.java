package com.example.实例;


import com.example.实例.model.DocDetailContext;
import com.example.实例.model.DocDetailStrategy;
import com.example.实例.model.DocEntity;
import com.example.实例.responsibility.DocResponsibility;
import com.example.实例.responsibility.impl.ArtisanResponsibility;
import com.example.实例.responsibility.impl.BaseResponsibility;
import com.example.实例.responsibility.impl.GoldCardResponsibility;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 1、初始化上下文内容
 * 2、责任链列表
 * 3、构建作品字段
 * 4、
 */
public class MainClass {

    public static void main(String[] args) {
        // 上下文对象
        DocDetailContext context = new DocDetailContext();
        context.setId("1");
        context.setName("作品1");
        context.setNewProductId("01");
        // 构建作品字段
        DocEntity entity = new DocEntity();

        // doc 责任链列表
        List<DocDetailStrategy> strategyList = new ArrayList<>();
        strategyList.add(new DocDetailStrategy(new BaseResponsibility(), "base"));      // 基础信息
        strategyList.add(new DocDetailStrategy(new GoldCardResponsibility(), "gold"));  // 小金卡
        strategyList.add(new DocDetailStrategy(new ArtisanResponsibility(), "artisan"));    // 手艺人

        strategyList.forEach(s -> {
            DocResponsibility bility = s.getDocResponsibility();
            // 执行结果
            Map<String, Object> result = bility.execute(context);
            // 判断重复属性
            result.forEach((k, v) -> {
                if (entity.getVars().containsKey(k)) {
                    if (!entity.getVars().get(k).equals(v)) {
                        System.out.println("节点：" + s.getAttrName() + "，K 重复 [" + k + "]，V 不相等，替换：[" + entity.getVars().get(k) + " | " + v + "]");
                    }
                }
            });
            // 填充对象
            entity.getVars().putAll(result);
        });

        // 生成solr字段





    }
}
