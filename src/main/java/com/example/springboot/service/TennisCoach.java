package com.example.springboot.service;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "practice for an hour";    
    }
    
}
