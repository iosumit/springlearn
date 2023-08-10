package com.springlearn.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StereoTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springlearn/stereotype/stereoconfig.xml");

        Student student = context.getBean("student", Student.class);
        System.out.println(student);
        System.out.println(student.getMarks());

        System.out.println(student.getVisited());
        System.out.println(student.getVisited().getClass().getName());

        System.out.println(student.hashCode());
        Student student2 = context.getBean("student", Student.class);
        System.out.println(student2.hashCode());
        // singleton 396883763 | 396883763
        // prototype 1148254374 | 938545229

        Teacher teacherObj1 = context.getBean("teacherObj", Teacher.class);
        Teacher teacherObj2 = context.getBean("teacherObj", Teacher.class);

        System.out.println(teacherObj1.hashCode());
        System.out.println(teacherObj2.hashCode());

    }
}
