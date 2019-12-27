package com.study.mywhile;

public class TestWhile {

    public static void main(String[] args) {

        String str = null;

        while (str != null){
            System.out.println("while");
        }

        for (int i = 0; str != null;i++){
            System.out.println("for");
        }

        do {
            System.out.println("do{}   while");
        }while (str !=null);
    }
}
