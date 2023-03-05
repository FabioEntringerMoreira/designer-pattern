package com.company.behaviorals.strategyTBDUrgent;

import java.math.BigDecimal;

public class StrategyMain {

    public static void main(String[] args) {

        PaymentStrategy paymentCash = new Cash();
        PaymentStrategy paymentCreditCard = new CreditCard();

        paymentCash.pay(new BigDecimal("10"));
        paymentCreditCard.pay(new BigDecimal("20"));
    }
}
