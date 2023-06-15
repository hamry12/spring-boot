package com.example.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.service.Coach;


/**
 * Note: Bean Scope
 * 1. By Default the scope of a bean is Singleton
 * 2. There are following Scopes
 *  -> Singleton : creates one instance throughout the journey
 *  -> Prototype : create one instance at each request
 *  -> request
 *  -> session
 *  -> global-session
 */

 /**
  * Scope:
    1. Life cycle of a bean
    2. How long does a bean live
    3. how many instances are created
  */


@RestController
public class ApplicationController {

    private Coach myCoach;
    private Coach alternativeCoach;

    // @Autowired
    // public ApplicationController(@Qualifier("cricketCoach") Coach myCoach,
    // @Qualifier("cricketCoach")Coach alternativeCoach){
    //     System.out.println("Application Constructor:\t"+getClass().getName());
    //     this.myCoach=myCoach;
    //     this.alternativeCoach=alternativeCoach;
    // }

    @Autowired
    public void setCoach(@Qualifier("footballCoach") Coach myCoach,
     @Qualifier("footballCoach") Coach alternativeCoach){
        this.myCoach=myCoach;
        this.alternativeCoach=alternativeCoach;
    }

    @GetMapping("/dailyRoutine")
    public String getDailyWorkout(){
        System.out.println("Singleton\t "+(myCoach == alternativeCoach));
        return myCoach.getDailyWorkout();
    }


    
}
