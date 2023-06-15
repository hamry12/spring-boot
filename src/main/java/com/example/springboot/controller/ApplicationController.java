package com.example.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.service.Coach;

@RestController
public class ApplicationController {

    private Coach myCoach;

    @Autowired
    public void setCoach(Coach myCoach){
        this.myCoach=myCoach;
    }

    @GetMapping("/dailyRoutine")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
    
}
