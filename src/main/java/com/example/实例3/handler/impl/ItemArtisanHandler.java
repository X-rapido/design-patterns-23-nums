package com.example.实例3.handler.impl;

import com.example.实例3.handler.BaseContext;
import com.example.实例3.handler.DocHandler;
import com.example.实例3.model.DocParam;

import java.util.HashMap;
import java.util.Map;

/**
 * 手艺人字段
 */
public class ItemArtisanHandler extends BaseContext implements DocHandler {

    @Override
    public Map<String, Object> execute(DocParam param) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "小美");
        map.put("sex", "女");
        map.put("age", 20);
        return map;
    }
}
