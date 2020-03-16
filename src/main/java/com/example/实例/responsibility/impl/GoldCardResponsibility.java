package com.example.实例.responsibility.impl;

import com.example.实例.model.ItemParam;
import com.example.实例.responsibility.DocResponsibility;

import java.util.HashMap;
import java.util.Map;

/**
 * 小金卡字段
 */
public class GoldCardResponsibility implements DocResponsibility {

    @Override
    public Map<String, Object> execute(ItemParam context) {
        Map<String, Object> map = new HashMap<>();
        map.put("goldCard", true);
        map.put("goldCardPrice", 10.0);
        return map;
    }
}
