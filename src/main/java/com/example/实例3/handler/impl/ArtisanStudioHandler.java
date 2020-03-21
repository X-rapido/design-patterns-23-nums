package com.example.实例3.handler.impl;

import com.example.实例3.handler.BaseContext;
import com.example.实例3.handler.DocHandler;
import com.example.实例3.model.DocParam;

import java.util.HashMap;
import java.util.Map;

/**
 * 手艺人-店铺信息
 */
public class ArtisanStudioHandler extends BaseContext implements DocHandler {

    @Override
    public Map<String, Object> execute(DocParam param) {
        Map<String, Object> map = new HashMap<>();
        map.put("id", "0001");
        map.put("studio_code", "tingfeng");
        map.put("studio_name", "听风工作室");
        return map;
    }
}
