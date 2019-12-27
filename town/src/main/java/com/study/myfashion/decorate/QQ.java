package com.study.myfashion.decorate;

public class QQ extends ChatTool {
    QQ(Communication communication) {
        super(communication);
    }

    @Override
    public String sendMessage(){
      qqSend(super.sendMessage());
      return null;
    }

    public void qqSend(String s){
        System.out.println("使用QQ发送信息");
    }
}
