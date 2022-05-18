package com.company.devices.cooker;

import com.company.devices.cooker.Cooker;

public class Oven extends Cooker {
    private int timer;

    public Oven(String name, int serialNumber) {
        super(name, serialNumber);
        this.timer = timer;
    }

    public Oven() {
        //EMPTY
    }

    @Override
    public void cook() {
        System.out.println("Oven is working...");
    }

    public void initTimer(int timer) {
        this.timer = timer;
        System.out.println("Timer has been set to " + timer);
        cook();
    }
}
