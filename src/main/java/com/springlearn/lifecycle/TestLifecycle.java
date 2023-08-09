package com.springlearn.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLifecycle {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext(
                "com/springlearn/lifecycle/lifecycleconfig.xml");

        // Destroy Object in AbstractApplicationContext
        context.registerShutdownHook();

        Samosa samosa = (Samosa) context.getBean("samosa1");
        System.out.println(samosa);

        Pepsi pepsi = (Pepsi) context.getBean("pepsizero");
        System.out.println(pepsi);
    }

}
