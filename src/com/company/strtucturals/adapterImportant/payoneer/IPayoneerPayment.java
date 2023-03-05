package com.company.strtucturals.adapterImportant.payoneer;

import com.company.strtucturals.adapterImportant.utils.TokenGenerator;

public interface IPayoneerPayment {

    TokenGenerator oauthToken();

    void sendPayment();

    void receivePayment();
}
