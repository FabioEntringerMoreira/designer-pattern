package com.company.behaviorals.strategyTBDUrgent;

import java.math.BigDecimal;

public class CreditCard implements PaymentStrategy{

    @Override
    public void pay(BigDecimal value) {
        System.out.println("Paying " + value + " by credit card");
    }
}
