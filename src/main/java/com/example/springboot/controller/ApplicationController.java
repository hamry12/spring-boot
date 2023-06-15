package com.example.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.service.Coach;


/**
 * Note: 
 * 1. Alternative way to sort multiple implemnetation is to use @Primary
 * 2. You can mark only class as @Primary
 * 3. If defined both @Qualifier has highest priority than @Primary
 */

@RestController
public class ApplicationController {

    private Coach myCoach;

    @Autowired
    public void setCoach(@Qualifier("tennisCoach")Coach myCoach){
        this.myCoach=myCoach;
    }

    @Autowired
    public ApplicationController(Coach myCoach){
        this.myCoach=myCoach;
    }

    @GetMapping("/dailyRoutine")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
    
}
