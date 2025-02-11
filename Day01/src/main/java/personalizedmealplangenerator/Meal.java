package personalizedmealplangenerator;

public class Meal {
    public MealPlan meal;

    public Meal(MealPlan meal) {
        this.meal = meal;
    }

    public void serveMeal() {
        meal.prepareMeal();
    }

    public Object getMeal() {
        return meal;
    }
}
