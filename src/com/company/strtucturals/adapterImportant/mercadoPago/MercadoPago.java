package com.company.strtucturals.adapterImportant.mercadoPago;

import com.company.strtucturals.adapterImportant.utils.TokenGenerator;

public class MercadoPago implements IMercadoPago{

    @Override
    public TokenGenerator oauthToken() {
        return new TokenGenerator();
    }

    @Override
    public void paymentSender() {
        checkPayment();
        System.out.println("Sending MercadoPago payment");
    }

    @Override
    public void paymentReceiver() {
        checkPayment();
        System.out.println("Receiving MercadoPago payment");
    }

    @Override
    public void checkPayment() {
        System.out.println("Payment is checked");
    }
}
