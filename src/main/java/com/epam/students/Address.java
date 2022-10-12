package com.epam.students;

import javax.xml.bind.annotation.XmlAccessType;
import
        javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import
        javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Address", propOrder = {
        "country",
        "city",
        "street"})
public class Address {
    @XmlElement(required = true)
    protected String country;
    @XmlElement(required = true)
    protected String city;
    @XmlElement(required = true)
    protected String street;

    public String getCountry() {
        return country;
    }

    public void setCountry(String value) {
        this.country = value;
    }

    public String getCity() {
        return city;
    }

    public void
    setCity(String value) {
        this.city = value;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String value) {
        this.street = value;
    }
}
