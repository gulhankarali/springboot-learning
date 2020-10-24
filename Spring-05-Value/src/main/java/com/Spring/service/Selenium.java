package com.Spring.service;

import com.Spring.implementation.Course;
import org.springframework.stereotype.Component;

@Component
public class Selenium implements Course {
    @Override
    public void getTeachingHours() {
        System.out.println("Teaching hours for Selenium ");
    }
}
