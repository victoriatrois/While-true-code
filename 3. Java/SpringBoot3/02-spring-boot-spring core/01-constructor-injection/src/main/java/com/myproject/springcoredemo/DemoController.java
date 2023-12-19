package com.myproject.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // define a private field for the dependency
    private Coach coach;
    //define a constructor for dependency injection
    @Autowired // for one constructor, @Autowired is optional
    public DemoController(Coach theCoach) {
        coach = theCoach;
    }

    // Add a new endpoint for "/dailyWorkout"
    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return coach.getDailyWorkout();
    }
}
