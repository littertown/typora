package com.study.myfashion;

public class People implements Sale {
    @Override
    public void process() {
        System.out.println("预定MINI phone");
    }

    @Override
    public void postSale() {
        System.out.println("预定MINI phone成功，准备配件");
    }
}
