package com.Spring.service;

import com.Spring.implementation.Course;
import com.Spring.implementation.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {
    @Autowired
    private OfficeHours officeHours;

    @Autowired
    private ExtraSessions extraSessions;

//    @Autowired
//    public Java (OfficeHours officeHours){
//        this.officeHours= officeHours;
//    }
//
//    @Autowired
//    public void setOfficeHours(OfficeHours officeHours) {
//        this.officeHours = officeHours;
//    }

    public void getTeachingHours() {
        System.out.println("Extra hours " + officeHours.getHours());
        System.out.println("Extra sessions " + extraSessions.getHours());
    }
}
