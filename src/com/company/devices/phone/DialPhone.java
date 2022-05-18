package com.company.devices.phone;

import com.company.interfaces.Caller;

public class DialPhone extends Phone implements Caller {

    private boolean hasAnswerphone;

    public DialPhone(String name, int serialNumber, boolean hasAnswerphone) {
        super(name, serialNumber);
        this.hasAnswerphone = hasAnswerphone;
    }

    public DialPhone() {
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

    public void autoAnswer() {
        if(hasAnswerphone) {
            System.out.println("AutoAnswer function is working");
        } else {
            System.out.println("Your device doesn't have AutoAnswer function");
        }
    }

    public boolean isHasAnswerphone() {
        return hasAnswerphone;
    }
}
