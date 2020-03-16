package com.example.实例2.model;


import com.example.实例2.spi.ItemResponse;
import lombok.Data;

@Data
public class B_Resp implements ItemResponse {
    private String categoryName;
    private String msg;
    private String code;
    private boolean success;

    @Override
    public boolean isSuccess() {
        return false;
    }
}
