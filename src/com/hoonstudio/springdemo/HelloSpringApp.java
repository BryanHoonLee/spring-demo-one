package com.hoonstudio.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

    public static void main(String[] args){

        // load the spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        CoachInterface theCoach = context.getBean("myCoach", CoachInterface.class);

        // call methods on the bean
        System.out.println(theCoach.dailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        // close the context
        context.close();

    }
}
