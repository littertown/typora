package com.study.myfashion.decorate;

public class BeginDecorate implements Communication {

    String msg;
    BeginDecorate(String s){
        this.msg = s;
    }
    @Override
    public String sendMessage() {
        System.out.println("bgrin");
        return null;
    }
}
