package com.study.Design.builer;

public class PersonBuiler {

    private Person person = new Person();

    public void addHead(Head head){
        person.setHead(head);
    }

    public void addBody(Body body){
        person.setBody(body);
    }

    public void AddLeg(Leg leg){
        person.setLeg(leg);
    }

    public Person builer(){
        return person;
    }
}
