package com.study.MyException;

public class TownException extends RuntimeException{

    /**
     *测试返回异常的信息
     * @param msg
     */
    public TownException(String msg){
        super(msg);
    }

    /**
     * 提供默认构造器
     */
    public  TownException (){};
}
