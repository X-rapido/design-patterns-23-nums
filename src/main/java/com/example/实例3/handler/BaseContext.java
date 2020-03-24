package com.example.实例3.handler;


import com.google.common.collect.Lists;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * 公共数据构建
 * @author liurenkui
 */
public abstract class BaseContext {

    protected static List<String> allCitys;     // 所有城市
    protected static List<String> allArtisan;   // 所有手艺人
    protected static List<String> allArtisanId; // 所有手艺人id
    protected static List<String> allStudioId;  // 所有店铺id

    /**
     * 初始化全局数据
     */
    public void init(){
        if (CollectionUtils.isEmpty(allCitys)) {
            this.getAllCity();
        }
        if (CollectionUtils.isEmpty(allArtisan) || CollectionUtils.isEmpty(allArtisanId)) {
            this.getAlllArtisan();
        }
    }

    /**
     * 所有城市
     */
    private void getAllCity(){
        allCitys = Lists.newArrayList("北京","上海","杭州");
    }

    /**
     * 所有手艺人
     */
    private void getAlllArtisan(){
        allArtisan = Lists.newArrayList("听风","白驹","江河");
        allArtisanId = Lists.newArrayList("001","002","003");
    }

    /**
     * 所有店铺id
     */
    private void getAllStudio(){
        allStudioId = Lists.newArrayList("01","02","03");
    }

}
