package com.study.myfashion;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynSaleProxy implements InvocationHandler {

    private Sale sale;

    DynSaleProxy(Sale sale){
        this.sale = sale;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开启代理模式"+proxy.getClass().getName());
        Object traget = method.invoke(sale,args);
        return traget;
    }
}
