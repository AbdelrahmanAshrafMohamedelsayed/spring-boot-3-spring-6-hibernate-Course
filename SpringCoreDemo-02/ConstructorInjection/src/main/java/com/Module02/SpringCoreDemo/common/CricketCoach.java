package com.Module02.SpringCoreDemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component // This annotation tells Spring to register this bean which will be used for dependency injection if needed
public class CricketCoach implements Coach {
    public CricketCoach() {
        System.out.println(">> CricketCoach: inside default constructor");
    }
    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println("In doMyStartupStuff(): " + getClass().getSimpleName());
    }
    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println("In doMyCleanupStuff(): " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes!!";
    }
}
