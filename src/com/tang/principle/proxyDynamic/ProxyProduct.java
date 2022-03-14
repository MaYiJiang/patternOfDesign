package com.tang.principle.proxyDynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * ClassName:ProxyProduct Package:com.tang.principle.proxyDynamic @Date:2021/10/25 12:02 @Author:TYH
 */
// 代理Rent对象
public class ProxyProduct implements InvocationHandler {
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    // 获取被代理的实例
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("中介介入");
        Object invoke = method.invoke(rent, args);
        return invoke;
    }
    // 自动获取代理类对象
    public Object getProxy() {
        return Proxy.newProxyInstance(
                rent.getClass().getClassLoader(), rent.getClass().getInterfaces(), this);
    }
}
