package com.hoonstudio.springdemo;

public class TennisCoach implements CoachInterface {

    @Override
    public String dailyWorkout(){
        return new String("Swing the racket 5 times");
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
