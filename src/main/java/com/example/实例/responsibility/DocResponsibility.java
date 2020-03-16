package com.example.实例.responsibility;


import com.example.实例.model.ItemParam;

import java.util.Map;

public interface DocResponsibility {

    /**
     * 执行方法
     */
    Map<String, Object> execute(ItemParam context);

}
