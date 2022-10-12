package com.epam.students;

import
        javax.xml.bind.JAXBElement;
import
        javax.xml.bind.annotation.XmlElementDecl;
import
        javax.xml.bind.annotation.XmlRegistry;
import
        javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {
    private
    final static QName _Person_QNAME =
            new QName("http://www.example.com/students", "person");
    private final static QName _Student_QNAME =
            new QName("http://www.example.com/students", "student");
    private final static QName _Abiturient_QNAME =
            new QName("http://www.example.com/students", "abiturient");

    public ObjectFactory() {
    }

    public Students createStudents() {
        return new Students();
    }

    public PersonType createPersonType() {
        return new PersonType();
    }

    public Student createStudent() {
        return new Student();
    }

    public Abiturient createAbiturient() {
        return new Abiturient();
    }

    public Address createAddress() {
        return new Address();
    }

    @XmlElementDecl(namespace = "http://www.example.com/students", name = "person")
    public  JAXBElement<PersonType> createPerson(PersonType value) {
        return new
                JAXBElement<PersonType>(_Person_QNAME, PersonType.class, null, value);
    }

    @XmlElementDecl(namespace = "http://www.example.com/students", name = "student",
            substitutionHeadNamespace = "http://www.example.com/students",
            substitutionHeadName = "person")
    public JAXBElement<Student> createStudent(Student value) {
        return new
                JAXBElement<Student>(_Student_QNAME, Student.class, null, value);
    }

    @XmlElementDecl(namespace = "http://www.example.com/students", name = "abiturient",
            substitutionHeadNamespace = "http://www.example.com/students",
            substitutionHeadName = "person")
    public JAXBElement<Abiturient> createAbiturient(Abiturient value) {
        return new
                JAXBElement<Abiturient>(_Abiturient_QNAME, Abiturient.class, null, value);
    }
}
