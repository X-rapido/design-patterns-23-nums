package com.example.实例.model;

import com.example.实例.responsibility.DocResponsibility;
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
     * 待执行的doc责任链对象
      */
    private DocResponsibility docResponsibility;

    /**
     * 节点名称
     */
    private String attrName;

}
