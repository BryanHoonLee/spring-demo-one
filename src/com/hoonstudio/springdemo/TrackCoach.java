package com.hoonstudio.springdemo;

public class TrackCoach implements CoachInterface {

    private FortuneService fortuneService;

    public TrackCoach(){

    }
    public TrackCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String dailyWorkout(){
        return new String("Do sprints for 10 minutes");
    }

    @Override
    public String getDailyFortune() {
        return "Just do it: " + fortuneService.getFortune();
    }
}
