package com.example.实例2;


import com.example.实例2.model.A_Req;
import com.example.实例2.model.A_Resp;
import com.example.实例2.model.B_Req;
import com.example.实例2.model.B_Resp;
import com.example.实例2.service.impl.ItemIntegratedServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 优势：
 *      1、结构清晰，请求/响应模块化
 *      2、具有顺序请求，B_Req 请求条件，可以依赖上层 A_Resp 结果
 *      3、ItemIntegratedServiceImpl 各个业务模块方法可以互相调用
 * 缺点：
 *      1、每个请求/响应都需要模块化处理
 *      2、每个模块，需增量定义 ItemIntegratedServiceImpl 方法
 * 思考：
 *      1、全局处理性能问题
 */
public class MainClass {

    @Autowired
    private ItemIntegratedServiceImpl itemIntegratedService;

    public void updateItem (String itemId) {
        // 1、

        A_Resp a_resp = itemIntegratedService.methodA(new A_Req());

        B_Resp b_resp = itemIntegratedService.methodB(new B_Req());

    }

    public static void main(String[] args) {

    }
}
