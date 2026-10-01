package com.nutritrack;
public class Food{
    private String name;
    private double calories;
    private double protein;
    private double referenceAmount;
    private MeasurementType measurementType;
  

public Food(String name, double calories, double protein, double referenceAmount, MeasurementType measurementType){
    this.name = name;
    this.calories = calories;
    this.protein = protein;
    this.referenceAmount = referenceAmount;
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

public double getReferenceAmount(){
    return referenceAmount;
}

public MeasurementType getMeasurementType(){
    return measurementType;
}

}