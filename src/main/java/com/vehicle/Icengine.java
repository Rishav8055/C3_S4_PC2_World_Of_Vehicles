package com.vehicle;

public class Fuel extends Engine {
    private String petrolEngine;
    private String dieselEngine;
    private String cngEngine;
    private String electricEngine;

    public Fuel(String modelNUmber, String displacement, int noOfCylinder, int maxRpm, int maxPower, String petrolEngine, String dieselEngine, String cngEngine, String electricEngine) {
        super(modelNUmber, displacement, noOfCylinder, maxRpm, maxPower);
        this.petrolEngine = petrolEngine;
        this.dieselEngine = dieselEngine;
        this.cngEngine = cngEngine;
        this.electricEngine = electricEngine;
    }

    public String getPetrolEngine() {
        return petrolEngine;
    }

    public void setPetrolEngine(String petrolEngine) {
        this.petrolEngine = petrolEngine;
    }

    public String getDieselEngine() {
        return dieselEngine;
    }

    public void setDieselEngine(String dieselEngine) {
        this.dieselEngine = dieselEngine;
    }

    public String getCngEngine() {
        return cngEngine;
    }

    public void setCngEngine(String cngEngine) {
        this.cngEngine = cngEngine;
    }

    public String getElectricEngine() {
        return electricEngine;
    }

    public void setElectricEngine(String electricEngine) {
        this.electricEngine = electricEngine;
    }
}
