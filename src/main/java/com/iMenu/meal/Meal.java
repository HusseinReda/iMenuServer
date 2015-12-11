package com.iMenu.meal;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table (name = "meal", uniqueConstraints= @UniqueConstraint(columnNames={"name"}))
public class Meal {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  @NotNull
  private int price;

  @NotNull
  private String name;
    public Meal(){}
  public Meal(String name, int price) {
    this.price = price;
    this.name = name;
  }
  public long getId() {
    return id;
  }
  public void setId(long value) {
    this.id = value;
  }
  public long getPrice() {
    return price;
  }
  public void setPrice(int price) {
    this.price = price;
  }
  public String getName() {
    return name;
  }
  public void setName(String value) {
    this.name = value;
  }
}
