package com.designpatterns.learnwithme.withstrategy;

import com.designpatterns.learnwithme.withstrategy.interfaces.DriveStrategy;

public class Vehicle {

  private DriveStrategy driveStrategy;

  // Constructor Injection
  Vehicle(DriveStrategy driveStrategy) {
    this.driveStrategy = driveStrategy;
  }

  public void drive() {
    driveStrategy.drive();
  }
}
