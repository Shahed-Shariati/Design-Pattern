package org.example.structuralDP.adaptor.usbc;

import org.example.structuralDP.adaptor.charge.ChargerAdaptor;
import org.example.structuralDP.adaptor.lighting.LightingCharger;

public class USBCChargerAdaptor implements ChargerAdaptor {

    private final USBcCharger usBcCharger;

    public USBCChargerAdaptor(USBcCharger usBcCharger) {
        this.usBcCharger = usBcCharger;
    }

    @Override
    public void charge() {
        usBcCharger.usbcCharge();
    }
}
