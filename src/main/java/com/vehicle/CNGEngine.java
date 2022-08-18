package com.vehicle;

public class CNGEngine extends Icengine {
    private String cng;

    public CNGEngine(String modelNUmber, int maxRpm, int maxPower, String displacement, String noOfCylinder, String cng) {
        super(modelNUmber, maxRpm, maxPower, displacement, noOfCylinder);
        this.cng = cng;
    }

    public String getCng() {
        return cng;
    }

    public void setCng(String cng) {
        this.cng = cng;
    }
}
