package iMenu;

import com.iMenu.meal.Meal;
import com.iMenu.meal.MealRepository;
import com.iMenu.meal.MealService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by sabaa on 12/11/15.
 */
public class mealTest {
    @Autowired
    MealRepository mealRepository;

    @Test
    public void getMeals(){
        List<Meal> meals = (List<Meal>) mealRepository.findAll();
        //Assert.assertEquals(3, meals.size());
    }
}