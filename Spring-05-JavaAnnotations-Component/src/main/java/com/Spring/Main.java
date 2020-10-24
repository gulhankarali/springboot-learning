package com.Spring;

import com.Spring.implementation.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.ast.Selection;

public class Main {
    public static void main(String[] args) {

        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        Course course1 = container.getBean("java", Course.class);

        Course course2 = container.getBean("selenium", Course.class);


        course1.getTeachingHours();
        course2.getTeachingHours();
    }
}
