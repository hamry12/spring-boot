package com.example.springboot.service;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Run the Sprint of 100 meters for 10 times";
    }
    
}
