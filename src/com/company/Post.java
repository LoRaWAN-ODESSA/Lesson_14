package com.company;

import com.company.interfaces.MailSender;

public class Post implements MailSender {

    @Override
    public String createMail(String text) {
        System.out.println("The mail has been created");
        return text;
    }

    @Override
    public void sendMail(String mail) {
        System.out.println("The mail has been sent. Text: " + mail);
    }
}
