package com.springlearn.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StereoTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springlearn/stereotype/stereoconfig.xml");

        Student student = context.getBean("student", Student.class);
        System.out.println(student);

        System.out.println(student.getVisited());
        System.out.println(student.getVisited().getClass().getName());

    }
}
