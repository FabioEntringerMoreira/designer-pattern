package com.company.behaviorals.templeteMethodTBD.payment;

public class Pix extends PaymentProcessor{

    @Override
    public void debit() {
        System.out.println("Debiting a Pix");
    }

    @Override
    protected void additionalNotification() {
        System.out.println("Sending email to the client");
    }
}
