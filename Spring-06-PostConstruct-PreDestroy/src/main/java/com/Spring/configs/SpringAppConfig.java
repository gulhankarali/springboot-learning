package com.Spring.configs;

import com.Spring.implementation.ExtraSessions;
import com.Spring.service.Java;
import com.Spring.service.MockInterviewHours;
import com.Spring.service.OfficeHours;
import com.Spring.service.Selenium;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.Spring")
public class SpringAppConfig {

    @Bean
    public Java java(){
        return new Java();
    }

    @Bean
    public Selenium selenium(){
        return new Selenium();
    }

    public OfficeHours officeHours(){
        return new OfficeHours();
    }

    public ExtraSessions extraSessionsOffice(){
        return new OfficeHours();
    }

    public ExtraSessions extraSessionsMock(){
        return new MockInterviewHours();
    }

}
