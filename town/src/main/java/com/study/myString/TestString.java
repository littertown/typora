package com.study.myString;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TestString {

    public static void charArrayToString(){

        char[] chars = new char[]{'a','b','c'};
        String str = new String(chars);
        System.out.println(str);
    }

    public static void ArraysCopy() {
        char[] chars = new char[]{'a', 'b', 'c'};
        char[] rechars = Arrays.copyOf(chars,chars.length);
        System.out.println(chars == rechars);
        System.out.println(rechars);
    }
    public static void main(String[] args) {

        /**
         * 1.本质上  String是char数组
         * 2.
         */
        new Object();

        /**
         * 1.Array类抛出的是空指针异常
         *      可以的类型：byte,short,int,long,double,char,obejct
         */
        charArrayToString();
        ArraysCopy();
    }
}
