package com.designpatterns.learnwithme.withstrategy;

import com.designpatterns.learnwithme.withstrategy.interfaces.impl.SpecialDriveStrategy;

public class SportsVehicle extends Vehicle {

  public SportsVehicle() {
    super(new SpecialDriveStrategy());
  }
}
