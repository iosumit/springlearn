package com.springlearn.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    // Adding Obj to bean IOC
    @Bean
    public Student getStudent() {
        // Creating a new Object
        Student student = new Student();
        return student;
    }
}
