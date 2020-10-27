package com.Spring;

import com.Spring.configs.SpringAppConfig;
import com.Spring.implementation.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(SpringAppConfig.class);

        Course course = container.getBean("java", Course.class);

        course.getTeachingHours();

        ((AnnotationConfigApplicationContext)container).close();

    }
}
