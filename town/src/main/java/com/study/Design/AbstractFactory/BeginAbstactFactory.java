package com.study.Design.AbstractFactory;

/**
 * 优点：
 * 1.开放闭合原则：增加新的product的时候，不需要修改内部。  面向抽象，接口
 * 2.里氏代换原则：通过继承，多态的形式
 * 3.单一原则：将创建的工程和实现的过程分开
 * 在这种抽象工厂下面。可以为其扩展不改变内的源码，
 *
 * 缺点
 * 1.增加类的数量将会成倍的加
 *
 *
 * list    iterator
 */
public class BeginAbstactFactory {

    public static void main(String[] args) {
//        AbstractFactory factory = new AbstractFactory(new Tshirt());
        TshirtFactory tshirtFactory = new TshirtFactory(new Tshirt());
        tshirtFactory.product();
    }
}
