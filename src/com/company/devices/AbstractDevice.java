package com.company.devices;

public abstract class AbstractDevice {
    private String name;
    private int serialNumber;

    public AbstractDevice(String name, int serialNumber) {
        this.name = name;
        this.serialNumber = serialNumber;
    }

    public AbstractDevice() {
        powerOn();
    }

    public abstract void powerOn();
    public abstract void powerOff();
}
