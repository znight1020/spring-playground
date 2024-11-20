package com.e205.kiosk.unit.beverage;

public class Latte implements Beverage {

  @Override
  public String getName() {
    return "라떼";
  }

  @Override
  public Integer getPrice() {
    return 4500;
  }
}
