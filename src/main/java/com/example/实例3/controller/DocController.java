package com.example.实例3.controller;

import com.example.实例3.model.DocParam;
import com.example.实例3.spi.DocUpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * 优点：
 *      1、结构简单，易上手开发
 *      2、新增业务，只需要在责任链中新增实现即可。
 *      3、公共查询和变量，可以在 BaseContext 体现
 * 缺点：
 *      1、全局使用公共请求参数，特殊需要下层请求参数，无法依赖上层返回结果
 *      2、返回属性值，后者会将前者覆盖（可以逻辑避免）
 */
@Controller
public class DocController {

    @Autowired
    private DocUpdateService docUpdateService;

    public void fullImportItem(){
        // 1、请求参数
        DocParam param = new DocParam();
        param.setItemId("1");
        param.setName("作品1");
        param.setArtisanId("01");

        docUpdateService.fullImportItem();
    }
}
