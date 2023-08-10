package com.springlearn.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springlearn/autowiring/autoconfig.xml");
        Emp emp = (Emp) context.getBean("empobj");
        System.out.println(emp);
    }
}
