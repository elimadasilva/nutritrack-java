package com.nutritrack;

public class Main {

    public static void main(String[] args){
        
        User user = new User("Eliane", 1400, 120);
        System.out.println(user.getName());
        System.out.println(user.getDailyCalorieGoal());
        System.out.println(user.getDailyProteinGoal());

        Food egg = new Food("ovo cozido", 78, 6.3, MeasurementType.UNIT);
        System.out.println(egg.getName());
        System.out.println(egg.getCalories());
        System.out.println(egg.getProtein());
          System.out.println(egg.getMeasurementType());
   
}
}
         