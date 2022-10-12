package com.epam.valid;

import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.File;
import java.io.IOException;

import static java.util.prefs.Preferences.factory;

public class ValidatorSAX {
    public static void main(String[] args) {
        String filename = "data/students.xml";
        String schemaname = "data/students.xsd";
        String logname = "logs/log.txt";
        Schema schema = null;
        String language = XMLConstants.W3C_XML_SCHEMA_INSTANCE_NS_URI;
        SchemaFactory = SchemaFactory.newInstance(language);
        try {
            schema = factory.newSchema(new File(schemaname));
            SAXParserFactory spf = SAXParserFactory.newInstance();
            spf.setSchema(schema);
            SAXParser parser = spf.newSAXParser();
            parser.parse(filename, new StudentErrorHandler(logname));
            System.out.println(filename + " is valid");
        } catch (ParserConfigurationException e) {
            System.err.println(filename + " config error: " + e.getMessage());
        } catch (SAXException e) {
            System.err.println(filename + " SAX error: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("I/O error: " + e.getMessage());
        }
    }
}
