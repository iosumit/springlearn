package com.springlearn.autowiring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoAnnoTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "com/springlearn/autowiring/annotation/autoannoconfig.xml");

        EmpAnno empAnno = (EmpAnno) context.getBean("empanno1");
        System.out.println(empAnno);
    }
}
