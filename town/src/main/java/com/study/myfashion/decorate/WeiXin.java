package com.study.myfashion.decorate;

public class WeiXin extends ChatTool{

    WeiXin(Communication communication) {
        super(communication);
    }

    public String sendMessage(){
        wxSend(super.sendMessage());
        return null;
    }

    public void wxSend(String a){
        System.out.println("使用WeChat发送信息");
    }
}
