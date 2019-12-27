package com.study.demo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

public class RepeatNum {

    public static void findRepeat(int[] objs){

        HashSet<Object> hashSet = new HashSet<>();
        for (int i = 0;i<objs.length;i++){

            for (int j = i+1;j<objs.length;j++){
                if (objs[i] == objs[j]){
                    hashSet.add(objs[i]);
                }
            }
        }
        System.out.println(hashSet);
    }
    public static void main(String[] args) {

        findRepeat(new int[]{1,2,3,2});
    }
}
