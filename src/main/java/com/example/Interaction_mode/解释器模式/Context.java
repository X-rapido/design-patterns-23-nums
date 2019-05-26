package com.example.Interaction_mode.解释器模式;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 上下文环境，用来保存文本
 */
@Data
@Accessors(chain = true)
public class Context {
    private String input;
    private int outpout;
}
