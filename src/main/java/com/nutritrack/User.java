package com.nutritrack;

/**
 * Represents the user profile and daily nutrition goals.
 * Representa o perfil do usuário e suas metas nutricionais diárias.
 */

public class User {
    private String name;
    private double dailyCalorieGoal;
    private double dailyProteinGoal;

    /*
     * Creates a user profile.
     * Cria um perfil de usuário.
     */

    public User(String name, double dailyCalorieGoal, double dailyProteinGoal) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }

        if (dailyCalorieGoal < 0) {
            throw new IllegalArgumentException(
                    "Daily calorie goal cannot be negative.");
        }

        if (dailyProteinGoal < 0) {
            throw new IllegalArgumentException(
                    "Daily protein goal cannot be negative.");
        }

        this.name = name;
        this.dailyCalorieGoal = dailyCalorieGoal;
        this.dailyProteinGoal = dailyProteinGoal;
    }

    public String getName() {
        return name;
    }

    public double getDailyCalorieGoal() {
        return dailyCalorieGoal;
    }

    public double getDailyProteinGoal() {
        return dailyProteinGoal;
    }

}