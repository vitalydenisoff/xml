package com.epam.main;
import javax.*;
import
        javax.xml.bind.annotation.*;
import
        javax.xml.bind.annotation.adapters.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Student", propOrder = {
        "name",
        "phone",
        "address"})

public class Student {
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    private String login;
    @XmlElement(required = true)
    private String name;
    @XmlAttribute(required = false)
    private String faculty;
    @XmlElement(required = true)
    private int phone;
    @XmlElement(required = true)
    private Address address = new Address();

    public Student() {
    }

    public Student(String login, String
            name, String faculty, int phone,
                   Address address) {
        this.login = login;
        this.name = name;
        this.faculty = faculty;
        this.phone = this.phone;
        this.address = address;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return
                address;
    }

    public void setAddress(Address address) {
        this.address
                = address;
    }

    public String toString() {
        return "\nLogin: " + login + "\nName: " + name + "\n Phone: " + phone + "\nFaculty: " + faculty + address.toString();
    }
    @XmlRootElement
    @XmlType(name = " address ", propOrder = {
            "city",
            "country",
            "street"})
    public static class
    Address {
        private String country;
        private String city;
        private String street;

        public Address() {
        }

        public Address(String country, String city, String street) {
            this.country = country;
            this.city = city;
            this.street = street;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String toString() {
            return "\n Address:" +
                    "\n \t Country: " + country + "\n \t City: " + city + "\n \t Street: " + street + "\n";
        }
    }
}