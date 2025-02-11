package mealplantest;


import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import personalizedmealplangenerator.Meal;
import personalizedmealplangenerator.MealFactory;
import personalizedmealplangenerator.VegetarianMeal;

import static org.junit.Assert.assertTrue;

public class MealPlanTest {
    @Test
    public void testMealServing() {
        Meal vegetarianMeal = MealFactory.createMeal(new VegetarianMeal());
        assertNotNull(vegetarianMeal.getMeal());
        assertTrue(vegetarianMeal.getMeal() instanceof VegetarianMeal);
    }
}

