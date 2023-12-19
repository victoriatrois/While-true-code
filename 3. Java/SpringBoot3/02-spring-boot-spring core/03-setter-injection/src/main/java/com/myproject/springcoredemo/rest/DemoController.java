package com.myproject.springcoredemo.rest;

import com.myproject.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // define a private field for the dependency
    private Coach coach;
    //define a method for setter injection
    @Autowired
    public void setCoach(Coach theCoach) {
        coach = theCoach;
    }

    // Add a new endpoint for "/dailyWorkout"
    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return coach.getDailyWorkout();
    }
}
