package com.example.实例2;


import com.example.实例2.model.A_Req;
import com.example.实例2.model.A_Resp;
import com.example.实例2.model.B_Req;
import com.example.实例2.model.B_Resp;
import com.example.实例2.service.impl.ItemIntegratedServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

public class MainClass {

    @Autowired
    private ItemIntegratedServiceImpl itemIntegratedService;

    public void updateItem (String itemId) {
        A_Resp a_resp = itemIntegratedService.methodA(new A_Req());

        B_Resp b_resp = itemIntegratedService.methodB(new B_Req());

    }

    public static void main(String[] args) {

    }
}
