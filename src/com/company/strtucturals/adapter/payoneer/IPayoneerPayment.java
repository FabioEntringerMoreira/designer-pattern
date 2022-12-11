package com.company.strtucturals.adapter.payoneer;

import com.company.strtucturals.adapter.utils.TokenGenerator;

public interface IPayoneerPayment {

    TokenGenerator oauthToken();

    void sendPayment();

    void receivePayment();
}
