package com.example.structure_mode.代理模式.静态代理;

/**
 * 静态代理角色
 */
public class WeddingProxy implements Marry{
    private Marry target;   // 代理对象

    public WeddingProxy(Marry target) {
        this.target = target;
    }

    private void before(){
        System.out.println("找对象");
    }
    private void after(){
        System.out.println("入洞房");
    }

    @Override
    public void marry() {
        this.before();
        target.marry(); // 执行代理方法前，做点什么 before、after
        this.after();
    }
}