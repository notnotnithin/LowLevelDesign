package com.designpatterns.learnwithme.withstrategy;

import com.designpatterns.learnwithme.withstrategy.interfaces.impl.NormalDrive;

public class GoodsVehicle extends Vehicle {

  public GoodsVehicle() {
    super(new NormalDrive());
  }
}
