package com.designpatterns.learnwithme.withstrategy.interfaces.impl;

import com.designpatterns.learnwithme.withstrategy.interfaces.DriveStrategy;

public class SpecialDriveStrategy implements DriveStrategy {

  @Override
  public void drive() {
    System.out.println("Special drive strategy");
  }
}
