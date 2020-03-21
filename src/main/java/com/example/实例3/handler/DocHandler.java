package com.example.实例3.handler;


import com.example.实例3.model.DocParam;

import java.util.Map;

public interface DocHandler {

    /**
     * 执行方法
     */
    Map<String, Object> execute(DocParam param);

}
