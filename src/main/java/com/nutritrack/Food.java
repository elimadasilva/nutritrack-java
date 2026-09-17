package com.nutritrack;
public class Food{
    private String name;
    private double calories;
    private double protein;
    private MeasurementType measurementType;
  

public Food(String name, double calories, double protein, MeasurementType measurementType){
    this.name = name;
    this.calories = calories;
    this.protein = protein;
    this.measurementType = measurementType;
    }

public String getName(){
    return name;
}

public double getCalories(){
    return calories;
}

public double getProtein(){
    return protein;
}

public MeasurementType getMeasurementType(){
    return measurementType;
}

}