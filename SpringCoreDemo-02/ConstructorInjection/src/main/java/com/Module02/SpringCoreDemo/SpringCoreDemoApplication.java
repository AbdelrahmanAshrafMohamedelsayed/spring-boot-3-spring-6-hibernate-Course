package com.Module02.SpringCoreDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(
//        scanBasePackages={"com.Module02.SpringCoreDemo",
//                "com.Module02.util",
//               })
@SpringBootApplication
public class SpringCoreDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCoreDemoApplication.class, args);
    }

}
