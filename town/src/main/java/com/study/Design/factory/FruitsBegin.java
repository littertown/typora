package com.study.Design.factory;

/**
 * 优点
 * 1.单一原则 ： 将类的创建和实例分开。
 * 好像   人脸识别的门一样，如果出现了损坏，修理的话，因为载一个主板上，要修改的全部修改。
 * 需要一个类来实现创建，这个类和创建关联在一起，其他的和这个类关联在一起
 * 这个中间创建的类一般不要改变，如果类的创建改变，只需要该这个类就ok
 *ps:原本所有的类和对象的关联在一起  属于 n
 * 有factory相当于 所有的类和 factory   属于n   factory和对象属于 1   所以这个factory应该属于不常变话的。
 *
 * 缺点：
 * 1.不满足开放-闭合的原则   每次添加类都需要将手动添加，需要修改源码
 *
 * a.将产品统一
 *
 * simpleDateFormat
 *
 */
public class FruitsBegin {
    public static void main(String[] args) {
        Fruits product = FruitsFactory.product("apple");
        product.name();
    }
}
