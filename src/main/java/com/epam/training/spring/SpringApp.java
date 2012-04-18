package com.epam.training.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SpringApp {

    @Autowired
    private GreetingService greeting ;
    
    public GreetingService getGreeting() {
        return greeting;
    }

    public void setGreeting(GreetingService greeting) {
        this.greeting = greeting;
    }

    public void say() {
        greeting.sayGreeting();
    }
}
