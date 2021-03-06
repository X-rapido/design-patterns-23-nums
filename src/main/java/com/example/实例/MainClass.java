package com.example.实例;


import com.example.实例.model.ItemParam;
import com.example.实例.model.DocStrategy;
import com.example.实例.model.DocEntity;
import com.example.实例.responsibility.DocResponsibility;
import com.example.实例.responsibility.impl.ArtisanResponsibility;
import com.example.实例.responsibility.impl.BaseContext;
import com.example.实例.responsibility.impl.ProductResponsibility;
import com.example.实例.responsibility.impl.GoldCardResponsibility;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 优点：
 *      1、结构简单，易上手开发
 *      2、新增业务，只需要在责任链中新增实现即可。
 *      3、公共查询和变量，可以在 BaseContext 体现
 * 缺点：
 *      1、全局使用公共请求参数，特殊需要下层请求参数，无法依赖上层返回结果
 *      2、返回属性值，后者会将前者覆盖（可以逻辑避免）
 *  思考：
 *      1、全局处理，性能问题
 */
public class MainClass {

    public static void main(String[] args) {
        // 1、请求参数
        ItemParam param = new ItemParam();
        param.setId("1");
        param.setName("作品1");
        param.setNewProductId("01");

        // 2、doc 责任链列表
        List<DocStrategy> strategyList = new ArrayList<>();
        strategyList.add(new DocStrategy(new ProductResponsibility(), "base"));      // 基础信息
        strategyList.add(new DocStrategy(new GoldCardResponsibility(), "goldCard"));  // 小金卡
        strategyList.add(new DocStrategy(new ArtisanResponsibility(), "artisanInfo"));    // 手艺人

        // 3、全局数据构建
        BaseContext context = new BaseContext();
        context.init();

        // 3、doc 字段填充
        DocEntity entity = new DocEntity();
        strategyList.forEach(s -> {
            DocResponsibility bility = s.getDocResponsibility();
            Map<String, Object> result = bility.execute(param);

            // 3.1 执行结果，判断重复属性
            result.forEach((k, v) -> {
                if (entity.getVars().containsKey(k)) {
                    if (!entity.getVars().get(k).equals(v)) {
                        System.out.println("节点：" + s.getAttrName() + "，K 重复 [" + k + "]，V 不相等，替换：[" + entity.getVars().get(k) + " -> " + v + "]");
                    }
                }
            });

            // 3.2 填充对象
            entity.getVars().putAll(result);
        });

        entity.getVars().forEach((k,v)-> System.out.println(k+":"+v));

        // 4、生成solr字段





    }
}
