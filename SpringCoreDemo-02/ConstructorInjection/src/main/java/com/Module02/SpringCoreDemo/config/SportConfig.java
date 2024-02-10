package com.Module02.SpringCoreDemo.config;

import com.Module02.SpringCoreDemo.common.Coach;
import com.Module02.SpringCoreDemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    // define bean for our swim coach
    @Bean
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
