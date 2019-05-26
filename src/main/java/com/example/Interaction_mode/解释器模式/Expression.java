package com.example.Interaction_mode.解释器模式;

/**
 * 抽象解释器
 */
public abstract class Expression {

    /**
     * 解释
     */
    protected abstract void interpret(Context context);
}
