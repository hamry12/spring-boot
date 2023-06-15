package com.example.constructor.injection.service;

import org.springframework.stereotype.Component;

/**
 * @Component class marks the classes as Spring Beans
 * and makes it available for Dependency injection. (DI)
 */

@Component
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice Fast Bowling for 15 Mins.";
    }
    
}
