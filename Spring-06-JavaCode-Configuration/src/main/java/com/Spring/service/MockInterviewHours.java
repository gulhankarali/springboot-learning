package com.Spring.service;

import com.Spring.implementation.ExtraSessions;

public class MockInterviewHours implements ExtraSessions {
    @Override
    public int getHours() {
        return 30;
    }
}
