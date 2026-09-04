package com.nutritrack;

public class Main {

    public static void main(String[] args){
        
       User user = new User("Eliane", 1400, 120);
    

    System.out.println(user.getName());
    System.out.println(user.getDailyCalorieGoal());
    System.out.println(user.getDailyProteinGoal());
}
}
         