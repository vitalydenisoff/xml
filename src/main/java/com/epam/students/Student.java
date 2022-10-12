package com.epam.students;

import javax.xml.bind.annotation.XmlAccessType;
import
        javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import
        javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;
import
        javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import
        javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Student")
public class Student extends PersonType {
    @XmlAttribute(name = "login", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String login;
    @XmlAttribute(name = "faculty")
    protected String
            faculty;

    public String getLogin() {
        return login;
    }

    public void
    setLogin(String value) {
        this.login = value;
    }

    public String getFaculty() {
        if (faculty == null) {
            return "mmf";
        } else {
            return faculty;
        }
    }

    public void setFaculty(String value) {
        this.faculty = value;
    }
}
