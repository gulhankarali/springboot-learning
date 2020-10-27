package com.Spring.service;


import com.Spring.implementation.ExtraSessions;

public class OfficeHours implements ExtraSessions {
    @Override
    public int getHours() {
        return 9;
    }
}
