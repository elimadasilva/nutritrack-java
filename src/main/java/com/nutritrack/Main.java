package com.nutritrack;

public class Main {

    public static void main(String[] args){
        
        User user = new User("Eliane", 1400, 120);
        System.out.println(user.getName());
        System.out.println(user.getDailyCalorieGoal());
        System.out.println(user.getDailyProteinGoal());

        Food egg = new Food("ovo cozido", 78, 6.3, 1, MeasurementType.UNIT);
        System.out.println(egg.getName());
        System.out.println(egg.getCalories());
        System.out.println(egg.getProtein());
        System.out.println(egg.getMeasurementType());

        Food rice = new Food("Arroz branco cozido", 130, 2.69, 100, MeasurementType.GRAM);
        System.out.println(rice.getName());
        System.out.println(rice.getCalories());
        System.out.println(rice.getProtein());
        System.out.println(rice.getReferenceAmount());
        System.out.println(rice.getMeasurementType());

        FoodEntry riceEntry = new FoodEntry(rice, 200);
        System.out.println(riceEntry.calculateCalories());
        System.out.println(riceEntry.calculateProtein());

        try{

            new FoodEntry(rice, 0);

        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

}


         