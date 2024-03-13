package org.example.structuralDP.adaptor;

import org.example.structuralDP.adaptor.charge.ChargerAdaptor;
import org.example.structuralDP.adaptor.lighting.LightingCharger;
import org.example.structuralDP.adaptor.lighting.LightingChargerAdaptor;
import org.example.structuralDP.adaptor.usbc.USBCChargerAdaptor;
import org.example.structuralDP.adaptor.usbc.USBcCharger;

public class Main {
    public static void main(String[] args) {
        ChargerAdaptor usbChargerAdaptor = new USBCChargerAdaptor(new USBcCharger());
        ChargerAdaptor lightingChargerAdaptor = new LightingChargerAdaptor(new LightingCharger());
        usbChargerAdaptor.charge();
        lightingChargerAdaptor.charge();
    }
}
