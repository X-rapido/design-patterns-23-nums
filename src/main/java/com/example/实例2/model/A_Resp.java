package com.example.实例2.model;


import com.example.实例2.spi.ItemResponse;
import lombok.Data;

@Data
public class A_Resp implements ItemResponse {
    private String productName;
    private String msg;
    private String code;
    private boolean success;

    @Override
    public boolean isSuccess() {
        return this.success;
    }
}
