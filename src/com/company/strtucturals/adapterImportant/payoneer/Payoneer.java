package com.company.strtucturals.adapterImportant.payoneer;

import com.company.strtucturals.adapterImportant.utils.TokenGenerator;

public class Payoneer implements IPayoneerPayment{


    @Override
    public TokenGenerator oauthToken() {
        return new TokenGenerator();
    }

    @Override
    public void sendPayment() {
        System.out.println("Payment with Payoneer");
    }

    @Override
    public void receivePayment() {
        System.out.println("Receiving Payoneer payment");
    }
}
