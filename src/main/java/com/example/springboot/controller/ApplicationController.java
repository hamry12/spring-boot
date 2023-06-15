package com.example.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.service.Coach;


/**
 * Note:
 * 1. All the classes are loaded upfront for bean initialization
 * 2. In order to stop that we can mark it using @Lazy annotation. 
 */

@RestController
public class ApplicationController {

    private Coach myCoach;

    @Autowired
    public ApplicationController(@Qualifier("tennisCoach") Coach myCoach){
        this.myCoach=myCoach;
    }

    @GetMapping("/dailyRoutine")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
    
}
