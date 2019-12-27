package com.study.myfashion;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CgLibProxy implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object obj = null;
        if (method.getName().equals("process")){
            System.out.println("开始了CgLib代理，为其方法process");
            obj = methodProxy.invoke(o,objects);
        }
//        if(method.getName().equals("postSale")){
//            System.out.println("开始了Cglib代理，为其 方法postSale");
//            obj = methodProxy.invoke(o,objects);
//        }
        return obj;
    }
}
