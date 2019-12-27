package com.study.myfashion.decorate;

public  class ChatTool implements  Communication {

     Communication communication;

     ChatTool(Communication communication){
         this.communication = communication;
     }

    public String sendMessage(){
        return communication.sendMessage();
    }
}
