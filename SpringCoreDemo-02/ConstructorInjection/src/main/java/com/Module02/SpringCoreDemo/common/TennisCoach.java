package com.Module02.SpringCoreDemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component // This annotation tells Spring to register this bean which will be used for dependency injection if needed
//@Primary // This annotation tells Spring to use this bean as the primary bean if there are multiple beans of the same type
public class TennisCoach implements Coach {
    public TennisCoach() {
        System.out.println(">> TennisCoach: inside default constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
}
