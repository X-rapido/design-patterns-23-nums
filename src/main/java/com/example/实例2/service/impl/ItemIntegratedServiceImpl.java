package com.example.实例2.service.impl;

import com.example.实例2.enums.ItemFactoryEnum;
import com.example.实例2.hander.ItemHandlerFactory;
import com.example.实例2.model.A_Req;
import com.example.实例2.model.A_Resp;
import com.example.实例2.model.B_Req;
import com.example.实例2.model.B_Resp;
import com.example.实例2.service.ItemIntegratedService;
import com.example.实例2.spi.ItemRequestHandler;
import org.springframework.beans.factory.annotation.Autowired;

public class ItemIntegratedServiceImpl implements ItemIntegratedService {

    @Autowired
    private ItemHandlerFactory<ItemRequestHandler> handles;

    @Override
    public A_Resp methodA(A_Req req) {
        ItemRequestHandler handler = handles.generate(ItemFactoryEnum.getValue(req.name()));
        A_Resp resp = (A_Resp) handler.execute(req);
        return resp;
    }

    @Override
    public B_Resp methodB(B_Req req) {
        ItemRequestHandler handler = handles.generate(ItemFactoryEnum.getValue(req.name()));
        B_Resp resp = (B_Resp) handler.execute(req);
        return resp;
    }
}
