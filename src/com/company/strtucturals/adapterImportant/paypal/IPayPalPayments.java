package com.company.strtucturals.adapterImportant.paypal;

import com.company.strtucturals.adapterImportant.utils.TokenGenerator;

public interface IPayPalPayments {

    TokenGenerator ouathToken();

    void paypalPayment();

    void paypalReceive();

}
