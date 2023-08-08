package com.springlearn.constructorinjection;

import java.util.List;

public class Person {
    int id;
    String name;
    Certificate certificate;
    List<String> addresses;

    public Person(int id, String name, Certificate certificate, List<String> addresses) {
        this.id = id;
        this.name = name;
        this.certificate = certificate;
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", certificate=" + certificate + ", addresses=" + addresses
                + "]";
    }

}
