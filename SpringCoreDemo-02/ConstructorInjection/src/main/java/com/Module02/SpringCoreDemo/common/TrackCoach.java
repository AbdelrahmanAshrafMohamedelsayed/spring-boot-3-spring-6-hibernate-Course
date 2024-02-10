package com.Module02.SpringCoreDemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component // This annotation tells Spring to register this bean which will be used for dependency injection if needed
//@Lazy // This annotation tells Spring to create this bean only when it is needed
public class TrackCoach implements Coach {
    public TrackCoach() {
        System.out.println(">> TrackCoach: inside default constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }
}
