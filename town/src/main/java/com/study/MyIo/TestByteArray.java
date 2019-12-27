package com.study.MyIo;

import java.io.*;

public class TestByteArray {

    public static void main(String[] args) throws IOException {
        File file = new File("F:\\pic\\bj.jpg");
        System.out.println("文件的大小="+file.length());
        ByteArrayInputStream stream = new ByteArrayInputStream(new byte[]{});

        FileInputStream fileInputStream = new FileInputStream(new File("F:\\pic\\bj.jpg"));
        System.out.println(fileInputStream.read());
        fileInputStream.skip(10);
        System.out.println(fileInputStream.read());
    }
}
