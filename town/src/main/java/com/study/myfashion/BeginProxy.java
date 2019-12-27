package com.study.myfashion;

import com.sun.org.apache.bcel.internal.generic.NEW;
import net.sf.cglib.proxy.Enhancer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class BeginProxy {

    public static void main(String[] args) {
        //动态代理
//        Sale object = (Sale) dynProxy();
//        object.process();
//        object.postSale();

        //cglib动态代理
        Other obj = (Other) CglibProxy();
        obj.postSale();
        obj.process();
    }

    //静态代理
    public static void staticProxy(){
        People people = new People();
        SaleProxy saleProxy = new SaleProxy();
        saleProxy.setPeople(people);
        saleProxy.process();
    }

    //动态代理
    public static Object dynProxy(){
        Sale target = new People();
        InvocationHandler handler = new DynSaleProxy(target);
        Object object = Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),handler);
        return object;
    }

    //cglib
    public static Object CglibProxy(){
        Other target = new Other();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(new CgLibProxy());
        Object object = enhancer.create();
        return object;
    }
}
