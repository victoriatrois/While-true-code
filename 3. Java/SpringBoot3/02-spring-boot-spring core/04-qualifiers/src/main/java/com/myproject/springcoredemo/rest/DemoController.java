package com.myproject.springcoredemo.rest;

import com.myproject.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // define a private field for the dependency
    private Coach coach;
    //define a constructor method for injection
    @Autowired
    public DemoController(@Qualifier("trackCoach") Coach theCoach) {
        coach = theCoach;
    }

    // Add a new endpoint for "/dailyWorkout"
    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return coach.getDailyWorkout();
    }
}
