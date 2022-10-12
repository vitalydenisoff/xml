package com.epam.students;

import
        java.util.ArrayList;
import java.util.List;
import
        javax.xml.bind.JAXBElement;
import
        javax.xml.bind.annotation.XmlAccessType;
import
        javax.xml.bind.annotation.XmlAccessorType;
import
        javax.xml.bind.annotation.XmlElementRef;
import
        javax.xml.bind.annotation.XmlRootElement;
import
        javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "person"
})
@XmlRootElement(name = "students")
public class Students {
    @XmlElementRef(name = "person", namespace = "http://www.example.com/students", type =
            JAXBElement.class)
    protected List<JAXBElement<? extends PersonType>> person;

    public List<JAXBElement<? extends PersonType>> getPerson() {
        if (person == null) {
            person = new ArrayList<JAXBElement<? extends PersonType>>();
        }
        return this.person;
    }
}
