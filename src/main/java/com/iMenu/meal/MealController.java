package com.iMenu.meal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MealController {

    @Autowired
    private MealService mealService;

    @RequestMapping("/meals")
    @ResponseBody
    public List<Meal> findAll (){
        return mealService.getAll();
    }

    @RequestMapping("/create")
    @ResponseBody
    public boolean createNewMeal(String name, int price) {
        String result = mealService.create(name, price);
        if (result == null)
            return false;
        return true;
    }
    @RequestMapping("/get-by-name")
    @ResponseBody
    public Meal getByName(String name){
        return mealService.getByName(name);
    }

    @RequestMapping("/delete")
    @ResponseBody
    public boolean deleteMealByName (String name){
        Meal meal = mealService.getByName(name);
        String result = mealService.delete(meal.getId());
        if(result == null)
            return false;
        return true;
    }

    @RequestMapping("/update")
    @ResponseBody
    public boolean updateMeal (String oldName,  String name, int price){
        Meal meal = mealService.getByName(oldName);
        String result = mealService.updateMeal(meal.getId(), name, price);
        if(result == null)
            return false;
        return true;
    }
}