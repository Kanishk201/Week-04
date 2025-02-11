package personalizedmealplangenerator;

public class MealFactory {
    public static Meal createMeal(MealPlan meal) {
        return new Meal(meal);
    }
}

