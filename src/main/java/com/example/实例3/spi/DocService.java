package com.example.实例3.spi;

import com.example.实例3.model.DocContent;

public interface DocService {

    /**
     * 更新doc文档
     * @param content
     * @return
     */
    void docUpdate(DocContent content);

}
