package com.company;

import com.company.devices.AbstractDevice;
import com.company.devices.phone.DialPhone;
import com.company.devices.cooker.Multicooker;
import com.company.devices.cooker.Oven;
import com.company.devices.phone.SmartPhone;
import com.company.interfaces.MailSender;

public class Main {
    public static void main(String[] args) {
        System.out.println("SmartPhone:");
        SmartPhone smartPhone1 = new SmartPhone("IPhone", 987877765, 1, "TrueTone", "IOs");
        smartPhone1.powerOn();
        smartPhone1.runApp();
        smartPhone1.call();
        smartPhone1.powerOff();

        System.out.println();

        System.out.println("DialPhone:");
        DialPhone dialPhone1 = new DialPhone("Samsung", 87765675, false);
        dialPhone1.powerOn();
        dialPhone1.call();
        dialPhone1.autoAnswer();
        dialPhone1.powerOff();

        System.out.println();

        System.out.println("Multicooker:");
        Multicooker multicooker1 = new Multicooker("Bosch", 64783930);
        multicooker1.powerOn();
        multicooker1.switchProgram(1);
        multicooker1.powerOff();

        System.out.println();

        System.out.println("Oven:");
        Oven oven1 = new Oven("Indesit", 84647748);
        oven1.powerOn();
        oven1.initTimer(5);
        oven1.powerOff();

        System.out.println();
        System.out.println("Task 2:");

        String mail1 = smartPhone1.createMail("Hello world");
        smartPhone1.sendMail(mail1);
        mail1 = smartPhone1.editMail("Hi, world");
        smartPhone1.sendMail(mail1);

        System.out.println();
        Post post1 = new Post();
        String mail = post1.createMail("Hi!!!");
        post1.sendMail(mail);

        System.out.println();
        switchOffAll(smartPhone1, dialPhone1, multicooker1, oven1);
        sendAll(smartPhone1, post1);
    }

    public static void switchOffAll(AbstractDevice ...devices) {
        for(AbstractDevice device : devices) {
            device.powerOff();
        }
    }

    public static void sendAll(MailSender ...devices) {
        for(MailSender device : devices) {
            device.createMail("Hello world");
            device.sendMail("Hello world");
        }
    }
}