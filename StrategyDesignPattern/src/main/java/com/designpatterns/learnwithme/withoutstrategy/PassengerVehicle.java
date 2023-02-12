package com.designpatterns.learnwithme.withoutstrategy;

public class PassengerVehicle extends Vehicle {

  @Override
  public void drive() {
    System.out.println("Passenger drive capability");
  }
}
