package com.example.实例3;


import com.example.实例3.model.DocParam;
import com.example.实例3.spi.DocUpdateService;
import com.example.实例3.spi.impl.DocUpdateServiceImpl;

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
public class Demo {

    public static void main(String[] args) {
        // 1、请求参数
        DocParam param = new DocParam();
        param.setItemId("1");
        param.setName("作品1");
        param.setArtisanId("01");

        // 执行更新
        DocUpdateService docUpdateService =new DocUpdateServiceImpl();
//        docUpdateService.fullImportItem();
        docUpdateService.fullImportArtisan();
//        docUpdateService.updateItems("01");




    }
}
