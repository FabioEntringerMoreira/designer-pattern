package com.company.strtucturals.adapterImportant.adapters;

import com.company.strtucturals.adapterImportant.mercadoPago.MercadoPago;
import com.company.strtucturals.adapterImportant.paypal.IPayPalPayments;
import com.company.strtucturals.adapterImportant.utils.TokenGenerator;

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
