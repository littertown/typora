package com.study.MyException;

public class TestException {

    public static void main(String[] args) {

        String str = "abcdefghjkl";
        System.out.println(str.length());
        if(str.length()>10)
            throw new TestStringLengthOutTenException("字符串超过10个");
    }
}
