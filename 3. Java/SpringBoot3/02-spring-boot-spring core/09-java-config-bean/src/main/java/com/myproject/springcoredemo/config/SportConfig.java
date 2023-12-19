package com.myproject.springcoredemo.config;

import com.myproject.springcoredemo.common.Coach;
import com.myproject.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    /*
     * Whenever a class cannot be annotated with @Component,
     * we can make it a bean through a configuration class.
     */
    @Bean("aquaticsCoach")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
