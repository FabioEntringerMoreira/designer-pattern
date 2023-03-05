package com.company.strtucturals.adapterImportant.adapters;

import com.company.strtucturals.adapterImportant.payoneer.Payoneer;
import com.company.strtucturals.adapterImportant.paypal.IPayPalPayments;
import com.company.strtucturals.adapterImportant.utils.TokenGenerator;

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
