package com.Module02.SpringCoreDemo.rest;

import com.Module02.SpringCoreDemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    //    define private field for the dependency
    private Coach MyCoach;
    private Coach AnotherCoach;

    //    define a constructor for dependency injection
    @Autowired
    public DemoController(@Qualifier("swimCoach") Coach theCoach,
                          @Qualifier("swimCoach") Coach anotherCoach) {
        System.out.println(">> DemoController: inside constructor");
        this.MyCoach = theCoach; // theCoach is the bean that is registered in the Spring container
//        theCoach is the bean that is registered in the Spring container which means that theCoach is the object of the class that implements the Coach interface
        this.AnotherCoach = anotherCoach;
    }
////    Setter injection
//    @Autowired
//    public void setMyCoach(Coach myCoach) {
//        MyCoach = myCoach;
//    }
//    Setter injection with any method name
//    @Autowired
//    public void Hello(Coach myCoach) {
//        MyCoach = myCoach;
//    }


    //    define endpoint for "/dailyWorkout"
    @GetMapping("/dailyWorkout")
    public String getDailyWorkout() {
        return MyCoach.getDailyWorkout();
//        return string
    }
//    define endpoint for "/check"
    @GetMapping("/check")
    public String check() {
       return "Check if the beans are the same: " + (MyCoach == AnotherCoach);
//        return string
    }

    /** for constructor injection, Spring is doing the following:
     behind the scenes, Spring is doing the following:
     Coach theCoach = new CricketCoach();
     DemoController demoController = new DemoController(theCoach);
     */
    /** for setter injection, Spring is doing the following:
     * Coach theCoach = new CricketCoach();
     *  DemoController demoController = new DemoController();
     * demoController.setCoach(theCoach);
     */
}
