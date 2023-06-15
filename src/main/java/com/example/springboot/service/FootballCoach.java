package com.example.springboot.service;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class FootballCoach implements Coach{

    public FootballCoach(){
        System.out.println("Football Constructor:\t"+getClass().getName());
    }

    @Override
    public String getDailyWorkout() {
        return "Run the Sprint of 100 meters for 10 times";
    }
    
}
