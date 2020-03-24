package com.example.实例3.spi.impl;

import com.example.实例3.enums.IndexEnum;
import com.example.实例3.model.DocEntity;
import com.example.实例3.spi.DocMappingService;
import org.springframework.stereotype.Service;

@Service
public class DocEsMappingSericeImpl implements DocMappingService {

    @Override
    public void mapping(IndexEnum indexEnum, DocEntity entity) {

        System.out.println("更新：" + indexEnum.getIndex() + " 成功\n");
    }

}
