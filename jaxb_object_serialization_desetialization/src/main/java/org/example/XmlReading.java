package org.example;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class XmlReading {
    public static void main(String[] args) {
        try {
            Parametri p1 = new Parametri();
            p1.setParametro("parametro_uno");
            p1.setMaggiore(1);
            p1.setMinore(1);
            p1.setRisultato(1);
            Parametri p2 = new Parametri();
            p2.setParametro("duo");
            p2.setMaggiore(2);
            p2.setMinore(2);
            p2.setRisultato(2);

            ParametriList parametriList = new ParametriList();
            parametriList.getLista().add(p1);
            parametriList.getLista().add(p2);

            JAXBContext jaxbContext = JAXBContext.newInstance(ParametriList.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(parametriList, new FileWriter("sample_out.xml"));

            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            ParametriList parametriList2 = (ParametriList) unmarshaller.unmarshal(new File("sample_out.xml"));

            System.out.println(parametriList2);
        } catch (JAXBException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
