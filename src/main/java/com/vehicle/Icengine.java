package com.vehicle;

public class Icengine extends Engine {
   private String displacement;
   private String noOfCylinder;

    public Icengine(String modelNUmber, int maxRpm, int maxPower, String displacement, String noOfCylinder) {
        super(modelNUmber, maxRpm, maxPower);
        this.displacement = displacement;
        this.noOfCylinder = noOfCylinder;
    }

    public String getDisplacement() {
        return displacement;
    }

    public void setDisplacement(String displacement) {
        this.displacement = displacement;
    }

    public String getNoOfCylinder() {
        return noOfCylinder;
    }

    public void setNoOfCylinder(String noOfCylinder) {
        this.noOfCylinder = noOfCylinder;
    }
}
