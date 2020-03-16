package com.example.实例2.service;

import com.example.实例2.model.A_Req;
import com.example.实例2.model.A_Resp;
import com.example.实例2.model.B_Req;
import com.example.实例2.model.B_Resp;

/**
 * 集成服务
 */
public interface ItemIntegratedService {

    A_Resp methodA(A_Req req);

    B_Resp methodB(B_Req req);

}
