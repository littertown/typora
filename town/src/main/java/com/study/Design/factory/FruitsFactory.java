package com.study.Design.factory;

public class FruitsFactory {

    public static Fruits product(String name){
        if ("apple".equals(name))
            return new Apple();
        if("orange".equals(name))
            return new Orange();
        if("banana".equals(name))
            return new Banana();
        return null;
    }
}
