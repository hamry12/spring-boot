package com.example.springboot.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FootballCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Run the Sprint of 100 meters for 10 times";
    }
    
}
