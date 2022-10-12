package com.epam.main;

import java.io.File;
import  javax.xml.XMLConstants;
import  javax.xml.bind.JAXBContext;
import  javax.xml.bind.JAXBException;
import  javax.xml.bind.Unmarshaller;
import  javax.xml.validation.Schema;
import  javax.xml.validation.SchemaFactory;
import  org.xml.sax.SAXException;
import com.epam.students.Students;

public class UnMarshalWithXSD {
    public static void main(String[ ] args) { JAXBContext jc = null; 
        try { jc = JAXBContext.newInstance("com.example.students");
        Unmarshaller um = jc.createUnmarshaller();
        String schemaName = "dat/person.xsd";
        SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        File schemaLocation = new File(schemaName);

        schema = factory.newSchema(schemaLocation);
        um.setSchema(schema);
        Students st = (Students) um.unmarshal(new File("data/students_ext.xml"));
        System.out.println(st);
    } catch (JAXBException e) { prinet.StackTrace();
    } catch (SAXException e) { prinet.StackTrace();
    }
    }
}