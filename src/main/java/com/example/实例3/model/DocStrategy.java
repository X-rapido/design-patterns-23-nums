package com.example.实例3.model;

import com.example.实例3.handler.DocHandler;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Doc 详情字段策略
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DocStrategy {

    /**
     * 待执行的doc策略
      */
    private DocHandler docHandler;

    /**
     * 节点名称
     */
    private String attrName;

}
