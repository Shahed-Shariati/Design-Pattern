package org.example.structuralDP.bridge.navigation;

import org.example.structuralDP.bridge.navigation.nav.GoogleMaps;
import org.example.structuralDP.bridge.navigation.nav.NavigationSystem;
import org.example.structuralDP.bridge.navigation.vehicle.Car;
import org.example.structuralDP.bridge.navigation.vehicle.Vehicle;

public class MainApp {
    public static void main(String[] args) {
        NavigationSystem googleMap = new GoogleMaps();
        Vehicle car = new Car(googleMap);
        car.drive();
    }
}
