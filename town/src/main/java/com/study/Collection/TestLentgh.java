package com.study.Collection;

import java.util.Arrays;

public class TestLentgh {

    /**
     * from   从你个哪里开始  包含
     * to     到哪里结束     不包含
     * @param args
     */
    public static void main(String[] args) {

        byte[] bytes = new byte[]{1,2,3,4,5,6,7,8,9,0};
        System.out.println(bytes.length);
        byte[] bytes1 = new byte[]{};
        bytes1 = Arrays.copyOfRange(bytes,0,5);
        System.out.println(bytes1.length);
        System.out.println(bytes1[0]);
        byte[] bytes2 = Arrays.copyOfRange(bytes, 5, 10);
        System.out.println(bytes2.length);
        System.out.println(bytes2[0]);
    }
}
