package com.company.behaviorals.strategyTBDUrgent;

import java.math.BigDecimal;

public class Cash implements PaymentStrategy{

    @Override
    public void pay(BigDecimal value) {
        System.out.println("Paying " + value + " by cash.");
    }
}
