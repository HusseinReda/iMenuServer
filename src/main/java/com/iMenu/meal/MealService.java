package com.iMenu.meal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by sabaa on 12/11/15.
 */
@Service
public class MealService {
    @Autowired
    private MealRepository mealRepository;

    public List<Meal> getAll()
    {
        return (List<Meal>) mealRepository.findAll();
    }
    public Meal getByName(String name) {
        String mealId;
        Meal meal;
        System.out.println(name);
        try {
            meal = mealRepository.findByName(name);
        }
        catch (Exception ex) {
            return null;
        }
        return meal;
    }
    public String create(String name, int price) {
        Meal meal = null;
        try {
            meal = new Meal(name, price);
            mealRepository.save(meal);
        }
        catch (Exception ex) {
            return null;
        }
        return "yes! (id = " + meal.getId() + ")";
    }
    public String delete(long id) {
        try {
            Meal meal = mealRepository.findById(id);
            mealRepository.delete(meal);
        }
        catch (Exception ex) {
            return "Error deleting the meal:" + ex.toString();
        }
        return "yes";
    }
    public String updateMeal(long id, String name, int price) {
        try {
            Meal meal = mealRepository.findOne(id);
            meal.setPrice(price);
            meal.setName(name);
            mealRepository.save(meal);
        }
        catch (Exception ex) {
            return "Error updating the meal: " + ex.toString();
        }
        return "yes";
    }
}
