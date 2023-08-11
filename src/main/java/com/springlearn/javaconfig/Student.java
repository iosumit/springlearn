package com.springlearn.javaconfig;

import org.springframework.stereotype.Component;

public class Student {
    Samosa samosa;

    public Student(Samosa samosa) {
        this.samosa = samosa;
    }

    public void study() {
        samosa.show();
        System.out.println("Student Studying");
    }

    public Samosa getSamosa() {
        return samosa;
    }

    public void setSamosa(Samosa samosa) {
        this.samosa = samosa;
    }
}
