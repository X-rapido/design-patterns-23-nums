package com.example.structure_mode.代理模式.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理角色
 */
public class MyInvocationHandler implements InvocationHandler {

    private UserService target;   // 代理对象

    public MyInvocationHandler(UserService target) {
        super();
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("真正的方法执行前！");

        // 执行目标对象的方法
        Object result = method.invoke(target, args);

        System.out.println("真正的方法执行后！");
        return result;
    }

    /**
     * 获取目标对象的代理对象
     */
    public Object getProxy() {
        return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), target.getClass().getInterfaces(), this);
    }
}