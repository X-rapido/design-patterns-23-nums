package com.example.实例3.handler.impl;

import com.example.实例3.handler.BaseContext;
import com.example.实例3.handler.DocHandler;
import com.example.实例3.model.DocParam;

import java.util.HashMap;
import java.util.Map;

/**
 * 商品-基本信息
 */
public class ItemBaseHandler extends BaseContext implements DocHandler {

    @Override
    public Map<String, Object> execute(DocParam param) {
        Map<String, Object> map = new HashMap<>();
        map.put("id", "0001");
        map.put("name", "书本");
        map.put("city", allCitys);
        return map;
    }
}
