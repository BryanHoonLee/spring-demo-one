package com.hoonstudio.springdemo;

public class MyApp {

    public static void main(String[] args){

        CoachInterface theCoach = new TrackCoach();

        System.out.println(theCoach.dailyWorkout());
    }
}
