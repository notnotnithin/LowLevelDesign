package com.designpatterns.learnwithme.withstrategy;

public class Main {

  public static void main(String[] args) {
    Vehicle sportsVehicle = new SportsVehicle();
    sportsVehicle.drive();

    Vehicle goodsVehicle = new GoodsVehicle();
    goodsVehicle.drive();

    Vehicle offRoadVehicle = new OffRoadVehicle();
    offRoadVehicle.drive();

    Vehicle passengerVehicle = new PassengerVehicle();
    passengerVehicle.drive();
  }
}
