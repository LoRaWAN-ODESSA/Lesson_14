package com.company.devices.phone;

import com.company.devices.AbstractDevice;

public abstract class Phone extends AbstractDevice {

    public Phone(String name, int serialNumber) {
        super(name, serialNumber);
    }

    public Phone() {
    }

    public abstract void powerOn();

    public abstract void powerOff();

    public abstract void call();

}
