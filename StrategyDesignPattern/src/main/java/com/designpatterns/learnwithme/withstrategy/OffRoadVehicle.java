package com.designpatterns.learnwithme.withstrategy;

import com.designpatterns.learnwithme.withstrategy.interfaces.impl.SpecialDriveStrategy;

public class OffRoadVehicle extends Vehicle {

  public OffRoadVehicle() {
    super(new SpecialDriveStrategy());
  }
}
