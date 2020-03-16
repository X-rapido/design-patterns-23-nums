package com.example.实例2.spi;

public interface ItemRequestHandler<Req extends ItemRequest, Resp extends ItemResponse> {

    Resp execute(Req req);

}
