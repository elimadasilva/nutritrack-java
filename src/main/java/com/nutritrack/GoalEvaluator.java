package com.nutritrack;

/**
 * Evaluates the user´s daily nutrition goals.
 * Avalia as metas nutricionais diárias do usuário.
 */

public class GoalEvaluator {

    public enum GoalStatus {
        BELOW_GOAL,
        GOAL_REACHED,
        GOAL_EXCEEDED
    }

    /**
     * Calculates the remaining calories based on the user's goal and daily intake.
     * Calcula as calorias restantes com base na meta do usuário e no consumo diário.
     */

    public double calculateRemainingCalories(User user, DailyIntake dailyIntake){
        return user.getDailyCalorieGoal() - dailyIntake.calculateTotalCalories();
    }

    /**
     * Calculates the protein remaining until the daily goal.
     * Calcula a diferença entre a meta diária e a proteína consumida.
     */
    public double calculateRemainingProtein(
            User user, DailyIntake dailyIntake) {

        return user.getDailyProteinGoal()
                - dailyIntake.calculateTotalProtein();
    }


    /**
     * Evaluates the calorie goal status.
     * Avalia a situação da meta de calorias.
     */

    public GoalStatus evaluateCaloriesGoal( double remainingCalories){
        if(remainingCalories > 0){
            return GoalStatus.BELOW_GOAL;
        } else if (remainingCalories == 0){
            return GoalStatus.GOAL_REACHED;
        } else {
            return GoalStatus.GOAL_EXCEEDED;
        }





    }


}