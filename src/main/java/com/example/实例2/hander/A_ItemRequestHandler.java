package com.example.实例2.hander;

import com.example.实例2.model.A_Req;
import com.example.实例2.model.A_Resp;
import com.example.实例2.spi.ItemRequestHandler;

public class A_ItemRequestHandler implements ItemRequestHandler<A_Req, A_Resp> {

    @Override
    public A_Resp execute(A_Req req) {
        return null;
    }

}
