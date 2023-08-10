package com.springlearn.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class SpelTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springlearn/spel/spelconfig.xml");

        Demo demo = context.getBean("demo", Demo.class);

        System.out.println(demo);

        SpelExpressionParser spel = new SpelExpressionParser();
        Expression exp = spel.parseExpression("2+3");
        System.out.println(exp.getValue());

    }
}
