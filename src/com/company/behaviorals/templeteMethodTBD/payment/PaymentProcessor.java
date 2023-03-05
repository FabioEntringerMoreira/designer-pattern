package com.company.behaviorals.templeteMethodTBD.payment;

public abstract class PaymentProcessor {
    
    public void process (){
        prepare();
        validate();
        debit();

        notifyClient();
        additionalNotification();

        finalizeProcess();
        additionalFinalizationProcess();
    }


    private void prepare() {
        System.out.println("prepare");
    }

    private void validate() {
        System.out.println("validade");
    }

    protected abstract void debit();

    private void notifyClient() {
        System.out.println("notifyClient");
    }

    private void finalizeProcess() {
        System.out.println("finalizeProcess");
    }

    protected void additionalFinalizationProcess() {}

    protected void additionalNotification() {}
}
