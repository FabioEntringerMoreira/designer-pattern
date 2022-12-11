package com.company.strtucturals.adapter.paypal;

import com.company.strtucturals.adapter.utils.TokenGenerator;

public class PayPal implements IPayPalPayments{

    private TokenGenerator token;


    @Override
    public TokenGenerator ouathToken() {
        return new TokenGenerator();
    }

    @Override
    public void paypalPayment() {
        this.token = ouathToken();
        System.out.println("Paymente with PayPal. Token: " + this.token.getToken());
    }

    @Override
    public void paypalReceive() {
        System.out.println("Receiving PayPal payment");
    }
}
