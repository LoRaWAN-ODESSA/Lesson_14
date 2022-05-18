package com.company.devices.phone;

import com.company.interfaces.Caller;
import com.company.interfaces.EmailSender;

public class SmartPhone extends Mobile implements Caller, EmailSender {
    private String os;

    public SmartPhone(String name, int serialNumber, int simCount, String display, String os) {
        super(name, serialNumber, simCount, display);
        this.os = os;
    }

    public SmartPhone() {
        //EMPTY
    }

    public void runApp() {
        System.out.println("The APP has been run");
    }

    public String getOs() {
        return os;
    }

    @Override
    public String editMail(String newText) {
        System.out.println("The mail has been changed. New text: " + newText);
        return newText;
    }

    @Override
    public String createMail(String text) {
        System.out.println("The mail has been created");
        return text;
    }

    @Override
    public void sendMail(String mail) {
        System.out.println("The mail has been sent. Text: " + mail);
    }

    @Override
    public void call() {
        super.call();
    }
}
