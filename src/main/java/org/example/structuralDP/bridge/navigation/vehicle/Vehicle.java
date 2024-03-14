package org.example.structuralDP.bridge.navigation.vehicle;

import org.example.structuralDP.bridge.navigation.nav.NavigationSystem;

public abstract class Vehicle {
    protected final NavigationSystem navigationSystem;

    public Vehicle(NavigationSystem navigationSystem) {
        this.navigationSystem = navigationSystem;
    }

    public  abstract void drive();
}
