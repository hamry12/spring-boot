package com.example.springboot.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class CricketCoach implements Coach{

    public CricketCoach(){
        System.out.println("Cricket Constructor:\t"+getClass().getName());
    }

    @Override
    public String getDailyWorkout() {
        return "Run for an hour";
    }
    
}
