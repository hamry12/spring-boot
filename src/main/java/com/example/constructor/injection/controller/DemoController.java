package com.example.constructor.injection.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.constructor.injection.service.Coach;

@RestController
public class DemoController {
    
    private Coach myCoach;

    @Autowired
    public DemoController(Coach theCoach){
        myCoach=theCoach;
    }


    @GetMapping("/dailyWorkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
