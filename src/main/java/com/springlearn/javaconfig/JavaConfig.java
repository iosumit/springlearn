package com.springlearn.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    // Adding Obj to bean IOC
    @Bean
    public Samosa getSamosa() {
        return new Samosa();
    }

    // @Bean
    @Bean(name = { "student", "stuObj" })
    public Student getStudent() {
        // Creating a new Object
        Student student = new Student(getSamosa());
        return student;
    }
}
