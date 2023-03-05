package com.company.strtucturals.adapterImportant.mercadoPago;

import com.company.strtucturals.adapterImportant.utils.TokenGenerator;

public interface IMercadoPago {

    TokenGenerator oauthToken();

    void paymentSender();

    void paymentReceiver();

    void checkPayment();

}
