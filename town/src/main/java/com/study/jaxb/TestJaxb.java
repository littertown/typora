package com.study.jaxb;

import com.town.test.model.SuperviseData;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class TestJaxb {

    public static void main(String[] args) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(SuperviseData.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        SuperviseData o = (SuperviseData) unmarshaller.unmarshal(new File("F:\\hlwjg\\参数\\接收xml"));
        System.out.println(o);
    }
}
