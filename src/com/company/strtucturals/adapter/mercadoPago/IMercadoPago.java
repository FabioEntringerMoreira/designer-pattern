package com.company.strtucturals.adapter.mercadoPago;

import com.company.strtucturals.adapter.utils.TokenGenerator;

public interface IMercadoPago {

    TokenGenerator oauthToken();

    void paymentSender();

    void paymentReceiver();

    void checkPayment();

}
