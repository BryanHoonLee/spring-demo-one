package com.hoonstudio.springdemo;

public class HappyFortuneService implements FortuneService {

    public String getFortune(){
        return new String("Today is your lucky day!");
    }
}
