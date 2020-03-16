package com.example.实例.responsibility.impl;

import com.example.实例.model.ItemParam;
import com.example.实例.responsibility.DocResponsibility;

import java.util.HashMap;
import java.util.Map;

/**
 * 手艺人字段
 */
public class ArtisanResponsibility extends BaseContext implements DocResponsibility {

    @Override
    public Map<String, Object> execute(ItemParam context) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "小美");
        map.put("sex", "女");
        map.put("age", 20);
        return map;
    }
}
