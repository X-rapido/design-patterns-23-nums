package com.example.实例3.handler.impl;

import com.example.实例3.handler.BaseContext;
import com.example.实例3.handler.DocHandler;
import com.example.实例3.model.DocParam;

import java.util.HashMap;
import java.util.Map;

/**
 * 手艺人-基本信息
 */
public class StudioBaseHandler extends BaseContext implements DocHandler {

    @Override
    public Map<String, Object> execute(DocParam param) {
        Map<String, Object> map = new HashMap<>();
        map.put("id", "0001");
        map.put("studio_code", "tingfeng");
        map.put("studio_code", "听风工作室");
        map.put("studio_city", allCitys);
        return map;
    }
}
