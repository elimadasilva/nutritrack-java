package com.nutritrack;

public class FoodEntry{
    private Food food;
    private double quantity;

    public FoodEntry(Food food, double quantity){
        if (food == null) {
            throw new IllegalArgumentException("Food cannot be null");
        }
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be a positive number");
        }
        this.food = food;
        this.quantity = quantity;
    }

    public Food getFood(){
        return food;
    }

    public double getQuantity(){
        return quantity;
    }

    public double calculateCalories(){
        return (food.getCalories()/ food.getReferenceAmount()) * quantity;
    }

    public double calculateProtein(){
        return (food.getProtein()/ food.getReferenceAmount()) * quantity;

    }

}
