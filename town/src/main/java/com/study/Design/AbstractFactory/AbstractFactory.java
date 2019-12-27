package com.study.Design.AbstractFactory;

public abstract class AbstractFactory {

    private AbstractProduct product;

    AbstractFactory(AbstractProduct abstractProduct){
        product = abstractProduct;
    }

    public void product(){
        product.name();
    }

}
