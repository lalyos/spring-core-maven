package com.epam.training.spring;

public class SpringApp {

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
