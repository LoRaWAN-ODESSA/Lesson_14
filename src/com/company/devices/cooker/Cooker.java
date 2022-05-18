package com.company.devices.cooker;

import com.company.devices.AbstractDevice;

public abstract class Cooker extends AbstractDevice {

    public Cooker(String name, int serialNumber) {
        super(name, serialNumber);
    }

    public Cooker() {
        //EMPTY
    }

    @Override
    public void powerOn() {
        System.out.println("Power has been switched ON");
    }

    @Override
    public void powerOff() {
        System.out.println("Power has been switched OFF");
    }

    public abstract void cook();
}
