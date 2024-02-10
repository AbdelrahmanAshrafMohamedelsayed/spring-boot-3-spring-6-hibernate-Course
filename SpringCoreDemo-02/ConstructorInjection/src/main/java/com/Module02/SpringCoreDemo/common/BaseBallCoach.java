package com.Module02.SpringCoreDemo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // This annotation tells Spring to register this bean which will be used for dependency injection if needed
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) // This annotation tells Spring to create a new instance of this bean every time it is requested

public class BaseBallCoach implements Coach {
    public BaseBallCoach() {
        System.out.println(">> BaseBallCoach: inside default constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }
}
