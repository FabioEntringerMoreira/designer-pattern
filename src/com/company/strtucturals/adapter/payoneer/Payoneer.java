package com.company.strtucturals.adapter.payoneer;

import com.company.strtucturals.adapter.utils.TokenGenerator;

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
