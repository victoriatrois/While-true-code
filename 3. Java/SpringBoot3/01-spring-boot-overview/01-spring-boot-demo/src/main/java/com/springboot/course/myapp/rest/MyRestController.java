package com.springboot.course.myapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
    // expose “/” that returns “Hello World”.
    @GetMapping("/")
    public String SayHello() {
        return "Hello World!";
    }
}

