package com.example.Interaction_mode.策略模式;

import lombok.AllArgsConstructor;
import lombok.Setter;

/**
 * 负责和具体的策略类交互
 *
 * 具体的算法和直接的客户端调用分离了，使得算法可以独立于客户端独立的变化。
 * 如果使用spring的依赖注入功能，还可以通过配置文件，动态的注入不同策略对象，动态的切换不同的算法.
 */
@Setter
@AllArgsConstructor
public class Context {
    private Strategy strategy;    // 策略对象

    public void printPrice(double price) {
        System.out.println("您该报价：" + strategy.getPrice(price));
    }


}
