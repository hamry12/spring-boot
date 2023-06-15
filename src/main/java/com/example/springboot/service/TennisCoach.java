package com.example.springboot.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TennisCoach implements Coach {

    public TennisCoach(){
        System.out.println("Tennis Constructor:\t"+getClass().getName());
    }

    @Override
    public String getDailyWorkout() {
        return "practice for an hour";    
    }
    
}
