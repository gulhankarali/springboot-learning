package com.Spring.service;

import com.Spring.implementation.Course;
import com.Spring.implementation.ExtraSessions;


import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@ToString
@Component
public class Java implements Course {

    @Value("Java")
    private String batch;

    @Value("${instructor}")
    private String instructor;

    @Value("${days}")
    private String[] days;

    public Java(@Qualifier("mockInterviewHours") ExtraSessions extraSessions) {
//        this.extraSessions = extraSessions;
    }

//    @Autowired
//    @Qualifier("officeHours")
//    private ExtraSessions extraSessions;


    public void getTeachingHours() {
        //System.out.println("Get teaching hours "+ extraSessions.getHours());

    }
}
