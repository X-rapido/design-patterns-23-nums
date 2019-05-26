package com.example.Interaction_mode.解释器模式;

/**
 * 自动递减实现
 */
public class MinusExpression extends Expression {

    @Override
    protected void interpret(Context context) {
        System.out.println("自动递减");

        // 获得上下文
        String input = context.getInput();
        // 类型转换
        int intInput = Integer.parseInt(input);
        // 递增
        intInput--;

        // 对上下文环境重新进行赋值
        context.setInput(String.valueOf(intInput));
        context.setOutpout(intInput);
    }
}
