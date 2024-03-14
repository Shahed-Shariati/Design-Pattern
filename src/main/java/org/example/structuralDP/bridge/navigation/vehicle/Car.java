package org.example.structuralDP.bridge.navigation.vehicle;

import org.example.structuralDP.bridge.navigation.nav.NavigationSystem;

public class Car extends Vehicle{
    public Car(NavigationSystem navigationSystem) {
        super(navigationSystem);
    }

    @Override
   public void drive() {
        System.out.println("Driving car " );
        super.navigationSystem.navigate();
    }
}
