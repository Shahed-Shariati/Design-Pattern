package org.example.structuralDP.adaptor.lighting;

import org.example.structuralDP.adaptor.charge.ChargerAdaptor;

public class LightingChargerAdaptor implements ChargerAdaptor {

    private final LightingCharger lightingCharger;

    public LightingChargerAdaptor(LightingCharger lightingCharger) {
        this.lightingCharger = lightingCharger;
    }

    @Override
    public void charge() {
        lightingCharger.lightingCharge();
    }
}
