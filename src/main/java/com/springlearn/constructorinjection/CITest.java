package com.springlearn.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CITest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "com/springlearn/constructorinjection/ciconfig.xml");
        Person personci = (Person) context.getBean("personci");
        System.out.println(personci.toString());
    }
}
