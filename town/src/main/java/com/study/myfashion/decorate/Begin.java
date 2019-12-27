package com.study.myfashion.decorate;

/**
 * 1.需要一个启动类
 *2.需要调动父类的方法
 *3.子类调动父类
 */
public class Begin {
    public static void main(String[] args) {
        ChatTool weiXin = new WeiXin(new QQ(new BeginDecorate("开始")));
        weiXin.sendMessage();
    }
}
