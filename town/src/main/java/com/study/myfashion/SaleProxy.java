package com.study.myfashion;

public class SaleProxy {

    private People people;

    public void process() {
        preSale();
        people.process();
        finshSale();
    }

    void preSale(){
        System.out.println("预定押金100");
    }

    void finshSale(){
        System.out.println("预定完后，配送中");
    }

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }

}
