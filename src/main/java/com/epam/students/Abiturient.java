package com.epam.students;

import
        javax.xml.bind.annotation.XmlAccessType;
import
        javax.xml.bind.annotation.XmlAccessorType;
import
        javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Abiturient", propOrder = {"averageMark"})
public class Abiturient extends PersonType {
    @XmlElement(name = "average-mark")
    protected double averageMark;

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double value) {
        this.averageMark = value;
    }
}
}
