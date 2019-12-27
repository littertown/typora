package com.study.Collection;

import org.aspectj.weaver.ast.Var;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestList {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");

//        for(int i = 0; i<list.size();i++){
//            list.remove(i);
//        }
//        for(int i = list.size()-1;i>0;){
//            list.remove(i);
//        }
        /**
         * java.util.ConcurrentModificationException
         */
//        for (String s : list){
//                list.remove(s);
//        }
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()){
//            list.remove(iterator.next());
//        }

//        for (int i = list.size()-1;i>=0;i--){
//            list.remove(i);
//        }

        /**
         * 使用iterator
         */
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()){
//            iterator.next();
//            iterator.remove();
//        }

        ArrayList arrayList = new ArrayList();
        arrayList.add("1");
        arrayList.add("2");
        list.removeAll(arrayList);

        System.out.println(list);
    }
}
