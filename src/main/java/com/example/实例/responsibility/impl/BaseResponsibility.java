package com.example.实例.responsibility.impl;

import com.example.实例.model.DocDetailContext;
import com.example.实例.responsibility.DocResponsibility;

import java.util.HashMap;
import java.util.Map;

/**
 * 数据表-基本信息
 */
public class BaseResponsibility implements DocResponsibility {

    @Override
    public Map<String, Object> execute(DocDetailContext context) {
        Map<String, Object> map = new HashMap<>();
        map.put("id", "0001");
        map.put("name", "书本");
        return map;
    }
}
