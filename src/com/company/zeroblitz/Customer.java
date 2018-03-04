package com.company.zeroblitz;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer {
    @XmlElement
    String name;
    @XmlElement
    int age;
    @XmlElement
    int id;
}
