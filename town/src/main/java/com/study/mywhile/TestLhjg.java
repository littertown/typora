package com.study.mywhile;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

import java.io.File;

public class TestLhjg {

    public static String xmlTojson(){

        String json = null;
        

        try {
            File file = new File("f:/test.txt");
            SAXReader saxReader=new SAXReader();
            Document document = saxReader.read(file);
            String xmlString = document.asXML();
            System.out.println(xmlString);
        } catch (DocumentException e) {
            e.printStackTrace();
        }

        return json;
    }

    public static void main(String[] args) {

        xmlTojson();
    }
}
