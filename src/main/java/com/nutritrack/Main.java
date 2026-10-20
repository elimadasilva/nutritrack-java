package com.nutritrack;

public class Main {

  public static void main(String[] args) {

    // Create the user profile (Cria o perfil do usuário)
    User user = new User("Eliane", 1400, 120);
    System.out.println(user.getName());
    System.out.println(user.getDailyCalorieGoal());
    System.out.println(user.getDailyProteinGoal());

    // Create a food: boiled egg (Cria um alimento: ovo cozido)
    Food egg = new Food("ovo cozido", 78, 6.3, 1, MeasurementType.UNIT);
    System.out.println(egg.getName());
    System.out.println(egg.getCalories());
    System.out.println(egg.getProtein());
    System.out.println(egg.getMeasurementType());

    // Crate a food: cooked white rice (cria um alimento: arroz branco cozido)
    Food rice = new Food("Arroz branco cozido", 130, 2.69, 100, MeasurementType.GRAM);
    System.out.println(rice.getName());
    System.out.println(rice.getCalories());
    System.out.println(rice.getProtein());
    System.out.println(rice.getReferenceAmount());
    System.out.println(rice.getMeasurementType());

    // Create a food entry: 200 g of rice
    // cria um registro de consumo: 200 g de arroz
    FoodEntry riceEntry = new FoodEntry(rice, 200);
    System.out.println(riceEntry.calculateCalories());
    System.out.println(riceEntry.calculateProtein());

    // Create a egg entry: 1 und of eggs
    // cria um registro de consumo: 1und de e
    FoodEntry eggsEntry = new FoodEntry(egg, 1);
    System.out.println(eggsEntry.calculateCalories());
    System.out.println(eggsEntry.calculateProtein());

    // Test invalid quantity (testa quantidade inválida)
    try {

      new FoodEntry(rice, 0);

    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }

    // Create the daily intake (cria o consumo diário)
    DailyIntake dailyIntake = new DailyIntake();

    // Add the rice entry to the daily intake
    // Adiciona o registro de arroz ao consumo diário

    dailyIntake.addEntry(riceEntry);
    // Add the eggs entry to the daily intake
    // Adiciona o registro de eggs ao consumo diário
    dailyIntake.addEntry(eggsEntry);

    System.out.println("Total calories consumed: " + dailyIntake.calculateTotalCalories());

    System.out.println("Total protein consumed: " + dailyIntake.calculateTotalProtein());

    // Create the goal evaluator (cria o avaliador de metas)
    GoalEvaluator goalEvaluator = new GoalEvaluator();

    // Calculate remaining calories (calcula as calorias restantes)
    double remainingCalories = goalEvaluator.calculateRemainingCalories(user, dailyIntake);

    System.out.println("Remaining calories for the day: " + remainingCalories);

    // Calculate remaining protein (calcula a proteína restante)
    double remainingProtein = goalEvaluator.calculateRemainingProtein(user, dailyIntake);

    System.out.println("Remaining protein for the day: " + remainingProtein);

   //Evaluate the calorie goal (avalia a meta de calorias)
   GoalEvaluator.GoalStatus calorieStatus = goalEvaluator.evaluateCaloriesGoal(remainingCalories);
   System.out.println("Calorie goal status: " + calorieStatus);
   // Test the three calorie goal statuses
// Testa os três estados da meta de calorias

System.out.println(goalEvaluator.evaluateCaloriesGoal(100));
System.out.println(goalEvaluator.evaluateCaloriesGoal(0));
System.out.println(goalEvaluator.evaluateCaloriesGoal(-100));
  }
}
