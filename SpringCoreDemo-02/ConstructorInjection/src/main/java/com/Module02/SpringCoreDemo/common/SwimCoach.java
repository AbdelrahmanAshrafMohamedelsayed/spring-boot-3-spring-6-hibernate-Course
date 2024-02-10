package com.Module02.SpringCoreDemo.common;

import org.springframework.stereotype.Component;


public class SwimCoach implements Coach {
    public SwimCoach() {
        }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up";
    }
}
