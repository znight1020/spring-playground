package com.e205.kiosk.unit.beverage;

public class Americano implements Beverage {



  @Override
  public String getName() {
    return "아메리카노";
  }

  @Override
  public Integer getPrice() {
    return 4000;
  }
}
