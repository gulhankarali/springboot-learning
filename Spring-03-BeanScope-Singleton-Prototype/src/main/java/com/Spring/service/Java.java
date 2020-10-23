package com.Spring.service;

import com.Spring.implementation.Course;

public class Java implements Course {
    @Override
    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours : 20");
    }
}
