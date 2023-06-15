package com.example.springboot.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class FootballCoach implements Coach{

    public FootballCoach(){
        System.out.println("Football Constructor:\t"+getClass().getName());
    }

    @Override
    public String getDailyWorkout() {
        return "Run the Sprint of 100 meters for 10 times";
    }
    
}
