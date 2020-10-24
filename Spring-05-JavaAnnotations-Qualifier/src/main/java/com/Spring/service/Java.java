package com.Spring.service;

import com.Spring.implementation.Course;
import com.Spring.implementation.ExtraSessions;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {


    public Java(@Qualifier("mockInterviewHours") ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

//    @Autowired
//    @Qualifier("officeHours")
    private ExtraSessions extraSessions;


    public void getTeachingHours() {
        System.out.println("Get teaching hours "+ extraSessions.getHours());
    }
}
