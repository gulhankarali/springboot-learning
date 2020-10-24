package com.Spring.service;

import com.Spring.implementation.ExtraSessions;
import org.springframework.stereotype.Component;

@Component
public class OfficeHours implements ExtraSessions {
    public int getHours() {
        return 4;
    }
}
