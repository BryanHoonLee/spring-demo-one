package com.hoonstudio.springdemo;

public class BaseballCoach implements CoachInterface{

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String dailyWorkout(){
        return new String("Spend 30 minutes on batting practice");
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
