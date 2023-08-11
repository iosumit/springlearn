package com.springlearn.javaconfig;

import org.springframework.stereotype.Component;

@Component("studentObj")
public class Student {
    public void study() {
        System.out.println("Student Studying");
    }
}
