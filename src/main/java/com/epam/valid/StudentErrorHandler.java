package com.epam.valid;

import org.apache.log4j.SimpleLayout;
import org.apache.logging.log4j.core.appender.FileAppender;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

import java.io.IOException;
import java.util.logging.Logger;

public class StudentErrorHandler extends DefaultHandler {
    private Logger logger = Logger.getLogger("com.epam.valid");
    public StudentErrorHandler(String log) throws IOException {
        logger.addAppender(new FileAppender(new SimpleLayout(), log));
    }
    public void warning(SAXParseException e) {
        logger.warn(getLineAddress(e) + " - " + e.getMessage());
    }
    public void error(SAXParseException e) {
        logger.error(getLineAddress(e) + " - " + e.getMessage());
    }
    public void fatalError(SAXParseException e) {
        logger.fatal(getLineAddress(e) + " - " + e.getMessage());
    }
    private String getLineAddress(SAXParseException e) {
        return e.getLineNumber() + " : " + e.getColumnNumber();
    }
}
