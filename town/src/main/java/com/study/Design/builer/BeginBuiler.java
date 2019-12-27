package com.study.Design.builer;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class BeginBuiler {

    public static void main(String[] args) {
        Head head = new Head("平头");
        Body body = new Body("钢铁之躯");
        Leg leg = new Leg("飞毛腿");
//        PersonBuiler builer1 = new PersonBuiler(head);
        PersonBuiler builer1 = new PersonBuiler();
        builer1.addBody(body);
        System.out.println( builer1.builer());
        builer1.builer().introduce();
        builer1.addHead(head);
        builer1.AddLeg(leg);
        builer1.builer().introduce();
        System.out.println( builer1.builer());
    }
}
