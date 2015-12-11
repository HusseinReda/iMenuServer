package com.iMenu.meal;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

@Transactional
public interface MealRepository extends CrudRepository<Meal, Long> {

  public Meal findByName(String name);
  public Meal findByPrice(int price);
  public Meal findById(long id);
}