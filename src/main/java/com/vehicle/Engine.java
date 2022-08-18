package com.vehicle;

public class Engine {
    private String modelNUmber;
    private int    maxRpm;
    private int    maxPower;

    public Engine(String modelNUmber,   int maxRpm, int maxPower) {
        this.modelNUmber = modelNUmber;
        this.maxRpm = maxRpm;
        this.maxPower = maxPower;
    }

    public String getModelNUmber() {
        return modelNUmber;
    }

    public void setModelNUmber(String modelNUmber) {
        this.modelNUmber = modelNUmber;
    }

    public int getMaxRpm() {
        return maxRpm;
    }

    public void setMaxRpm(int maxRpm) {
        this.maxRpm = maxRpm;
    }

    public int getMaxPower() {
        return maxPower;
    }

    public void setMaxPower(int maxPower) {
        this.maxPower = maxPower;
    }
}
