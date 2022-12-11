package com.company.strtucturals.adapter.paypal;

import com.company.strtucturals.adapter.utils.TokenGenerator;

public interface IPayPalPayments {

    TokenGenerator ouathToken();

    void paypalPayment();

    void paypalReceive();

}
