package com.company.devices.cooker;

public class Multicooker extends Cooker {

    private int program;

    public Multicooker(String name, int serialNumber) {
        super(name, serialNumber);
    }

    public Multicooker() {
        //EMPTY
    }

    public void switchProgram(int program) {
        this.program = program;
        System.out.println("Program has been switched to " + program);
        cook();
    }
    @Override
    public void cook() {
        System.out.println("Program " + program + " has been started...");
    }

    public int getProgram() {
        return program;
    }
}
