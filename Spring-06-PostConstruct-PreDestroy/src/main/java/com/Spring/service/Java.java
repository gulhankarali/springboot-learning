package com.Spring.service;

import com.Spring.implementation.Course;
import com.Spring.implementation.ExtraSessions;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Arrays;

@Component
public class Java implements Course {

    @PostConstruct
    public void postConstruct(){
        System.out.println("creating");
    }

    public void getTeachingHours() {
        System.out.println("Weekly extra hours ");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("destroying");
    }
}
