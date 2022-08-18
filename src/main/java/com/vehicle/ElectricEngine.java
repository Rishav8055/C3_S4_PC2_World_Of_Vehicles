package com.vehicle;

public class ElectricEngine extends Engine {
    private int voltage;
    private int current;

    public ElectricEngine(String modelNUmber, int maxRpm, int maxPower, int voltage, int current) {
        super(modelNUmber, maxRpm, maxPower);
        this.voltage = voltage;
        this.current = current;
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }
}
