package com.vehicle;

public class PetrolEngine extends Icengine {
    private String fuelType;

    public PetrolEngine(String modelNUmber, int maxRpm, int maxPower, String displacement, String noOfCylinder, String fuelType) {
        super(modelNUmber, maxRpm, maxPower, displacement, noOfCylinder);
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
