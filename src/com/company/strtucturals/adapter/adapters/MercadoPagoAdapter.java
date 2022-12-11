package com.company.strtucturals.adapter.adapters;

import com.company.strtucturals.adapter.mercadoPago.MercadoPago;
import com.company.strtucturals.adapter.paypal.IPayPalPayments;
import com.company.strtucturals.adapter.utils.TokenGenerator;

public class MercadoPagoAdapter implements IPayPalPayments {

    private MercadoPago mercadoPago;

    public MercadoPagoAdapter(MercadoPago mercadoPago){
        this.mercadoPago = mercadoPago;
    }

    @Override
    public TokenGenerator ouathToken() {
        return new TokenGenerator();
    }

    @Override
    public void paypalPayment() {
        this.mercadoPago.paymentSender();
    }

    @Override
    public void paypalReceive() {
        this.mercadoPago.paymentReceiver();
    }
}
