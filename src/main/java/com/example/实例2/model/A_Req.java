package com.example.实例2.model;


import com.example.实例2.spi.ItemRequest;
import lombok.Data;

@Data
public class A_Req implements ItemRequest {
    private String userId;
    private String productIds;

    @Override
    public String name() {
        return null;
    }
}
