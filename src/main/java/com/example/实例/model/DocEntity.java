package com.example.实例.model;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * 作品
 */
@Data
public class DocEntity {

    private Map<String, Object> vars = new HashMap<>();
}
