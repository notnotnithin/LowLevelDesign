package com.designpatterns.learnwithme.withstrategy.interfaces.impl;

import com.designpatterns.learnwithme.withstrategy.interfaces.DriveStrategy;

public class NormalDrive implements DriveStrategy {

  @Override
  public void drive() {
    System.out.println("Normal drive strategy");
  }
}
