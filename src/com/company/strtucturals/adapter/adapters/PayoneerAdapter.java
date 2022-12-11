package com.company.strtucturals.adapter.adapters;

import com.company.strtucturals.adapter.payoneer.Payoneer;
import com.company.strtucturals.adapter.paypal.IPayPalPayments;
import com.company.strtucturals.adapter.utils.TokenGenerator;

public class PayoneerAdapter implements IPayPalPayments {
    private Payoneer payoneer;

    public PayoneerAdapter(Payoneer payoneer){
        this.payoneer = payoneer;
        System.out.println("Adapt Payoneer using PayPal methods");
    }


    @Override
    public TokenGenerator ouathToken() {
        return new TokenGenerator();
    }

    @Override
    public void paypalPayment() {
        this.payoneer.sendPayment();
    }

    @Override
    public void paypalReceive() {
        this.payoneer.receivePayment();
    }
}
