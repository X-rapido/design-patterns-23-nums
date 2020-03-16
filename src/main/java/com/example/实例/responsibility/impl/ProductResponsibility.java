package com.example.实例.responsibility.impl;

import com.example.实例.model.ItemParam;
import com.example.实例.responsibility.DocResponsibility;

import java.util.HashMap;
import java.util.Map;

/**
 * 商品-基本信息
 */
public class ProductResponsibility extends BaseContext implements DocResponsibility {

    @Override
    public Map<String, Object> execute(ItemParam context) {
        Map<String, Object> map = new HashMap<>();
        map.put("id", "0001");
        map.put("name", "书本");
        map.put("city", allCitys);
        return map;
    }
}
