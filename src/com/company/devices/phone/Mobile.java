package com.company.devices.phone;

public class Mobile extends Phone {
    private int simCount;
    private String display;

    public Mobile(String name, int serialNumber, int simCount, String display) {
        super(name, serialNumber);
        this.simCount = simCount;
        this.display = display;
    }

    public Mobile() {
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

    @Override
    public void call() {
        System.out.println("Choosing the contact and calling");
    }

    public int getSimCount() {
        return simCount;
    }

    public String getDisplay() {
        return display;
    }
}
