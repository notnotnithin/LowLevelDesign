package com.designpatterns.learnwithme.withstrategy;

import com.designpatterns.learnwithme.withstrategy.interfaces.impl.NormalDrive;

public class PassengerVehicle extends Vehicle {

  public PassengerVehicle() {
    super(new NormalDrive());
  }
}
