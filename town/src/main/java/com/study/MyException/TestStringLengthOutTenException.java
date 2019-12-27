package com.study.MyException;

/**
 * 1.需要默认构造器
 */
public class TestStringLengthOutTenException extends  TownException {

    public String errorCode;

    /**
     * 异常信息描述
     * @param msg
     */
    public TestStringLengthOutTenException(String msg){
        super(msg);
    }

//    public TestStringLengthOutTenException(String msg , String errorCode){
//        super(msg,errorCode,true);
//    }
}
