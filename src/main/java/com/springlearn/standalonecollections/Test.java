package com.springlearn.standalonecollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "com/springlearn/standalonecollections/standalonecollectionconfig.xml");
        Person person = (Person) context.getBean("personobj");

        System.out.println(person.getFriends());
        System.out.println(person.getFriends().getClass().getName());

        System.out.println(person.getFees());
        System.out.println(person.getFees().getClass().getName());

        System.out.println(person.getProps());
        System.out.println(person.getProps().getClass().getName());
    }
}
