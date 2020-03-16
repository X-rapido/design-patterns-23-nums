package com.example.实例2.hander;

import com.example.实例2.model.B_Req;
import com.example.实例2.model.B_Resp;
import com.example.实例2.spi.ItemRequestHandler;

public class B_ItemRequestHandler implements ItemRequestHandler<B_Req, B_Resp> {

    @Override
    public B_Resp execute(B_Req req) {
        return null;
    }

}
