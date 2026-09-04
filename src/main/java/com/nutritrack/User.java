package com.nutritrack;

public class User {
    private String name;
    private double dailyCalorieGoal;
    private double dailyProteinGoal;

    public User(String name, double dailyCalorieGoal, double dailyProteinGoal){
        this.name = name;
        this.dailyCalorieGoal = dailyCalorieGoal;
        this.dailyProteinGoal = dailyProteinGoal;
    }

    public String getName(){
        return name;
    }

    public double getDailyCalorieGoal(){
        return dailyCalorieGoal;
    }

    public double getDailyProteinGoal(){
        return dailyProteinGoal;
    }

}