package iMenu.meal;

import com.iMenu.meal.Meal;
import iMenu.TestConfig;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;

/**
 * Created by sabaa on 12/11/15.
 */
public class mealTest extends TestConfig {

    @Test
    public void getMeals()throws Exception{
        List<Meal> meals = (List<Meal>) mealRepository.findAll();
        Assert.assertEquals(3, meals.size());
    }
}