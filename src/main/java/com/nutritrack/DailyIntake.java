package com.nutritrack;

import java.util.List; 
import java.util.ArrayList;

public class DailyIntake {

  // Stores all food entries consumed during the day
  // Armazena todos os registros de alimentos consumidos durante o dia
    private List<FoodEntry> entries = new ArrayList<>();
  
  // Adds a food entry to the daily intake
  // Adiciona um registro de alimento ao consumo diário
  public void addEntry(FoodEntry entry){

    entries.add(entry);
    
  }
  // Calculates the total calories consumed during the day
  // Calcula o total de calorias consumidas durante o dia
  public double calculateTotalCalories(){
    
    double totalCalories = 0;
    for (FoodEntry entry : entries) {
        totalCalories += entry.calculateCalories();
    }
    return totalCalories;
  }

  //Calculates the total protein consumed during the day
  //Calcula o total de proteina consumida durante o dia
  
  public double calculateTotalProtein(){
    double totalProtein = 0;
    for (FoodEntry entry : entries) {
        totalProtein += entry.calculateProtein();
    }
    return totalProtein;
  }
  



}