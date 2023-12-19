package com.myproject.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    public CricketCoach() {
        System.out.println("In constructor: " + this.getClass().getSimpleName());
    }

    // define an initialization method
    @PostConstruct
    public void prepareTheField() {
        System.out.println("In prepareTheField(): " +getClass().getSimpleName());
    }

    // defina a destroy method
    @PreDestroy
    public void cleanUp() {
        System.out.println("In cleanUp(): " +getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes :)";
    }
}
