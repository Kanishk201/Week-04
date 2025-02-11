package personalizedmealplangenerator;

public class MealPlanGeneratorMain {
    public static void main(String[] args) {
        // Generate different meal plans dynamically
        Meal vegetarianMeal = MealFactory.createMeal(new VegetarianMeal());
        vegetarianMeal.serveMeal();

        Meal veganMeal = MealFactory.createMeal(new VeganMeal());
        veganMeal.serveMeal();

        Meal ketoMeal = MealFactory.createMeal(new KetoMeal());
        ketoMeal.serveMeal();

        Meal highProteinMeal = MealFactory.createMeal(new HighProteinMeal());
        highProteinMeal.serveMeal();
    }
}

