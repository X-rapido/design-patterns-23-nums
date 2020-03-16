package com.example.实例.responsibility.impl;


import com.google.common.collect.Lists;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * 基础数据构建
 */
public class BaseContext {

    protected static List<String> allCitys;

    /**
     * 初始化全局数据
     */
    public void init(){
        if (CollectionUtils.isEmpty(allCitys)) {
            this.getAllCity();
        }
    }

    /**
     * 所有城市
     */
    private void getAllCity(){
        allCitys = Lists.newArrayList("北京","上海","杭州");
    }

}
