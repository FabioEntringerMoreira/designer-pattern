package com.company.strtucturals.adapterImportant.paypal;

import com.company.strtucturals.adapterImportant.utils.TokenGenerator;

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
