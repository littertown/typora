package com.study.Design.builer;

public class Person {

    private Head head;
    private  Body body;
    private Leg leg;

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public void introduce(){
        if(head != null)
            System.out.println(head.getHead().toString());
        if(body != null)
            System.out.println(body.getBody().toString());
        if(leg != null)
            System.out.println(leg.getLeg().toString());
    }
}
