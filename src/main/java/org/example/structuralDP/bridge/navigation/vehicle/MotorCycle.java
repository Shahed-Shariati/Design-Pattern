package org.example.structuralDP.bridge.navigation.vehicle;

import org.example.structuralDP.bridge.navigation.nav.NavigationSystem;

public class MotorCycle extends Vehicle{
    public MotorCycle(NavigationSystem navigationSystem) {
        super(navigationSystem);
    }

  @Override
  public void drive() {
        System.out.println("Driving motorCycle");
        super.navigationSystem.navigate();
    }
}
