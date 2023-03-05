package com.company.behaviorals.chainOfResponsibility.exemple2;

public class Exemple2 {

    interface PaymentHandler {
        void setNext(PaymentHandler next);
        boolean process(double amount);
    }

    static class FraudDetectionHandler implements PaymentHandler {
        private PaymentHandler next;

        @Override
        public void setNext(PaymentHandler next) {
            this.next = next;
        }

        @Override
        public boolean process(double amount) {
            if (amount > 1000) {
                System.out.println("Payment declined by Fraud Detection Handler. Amount too high.");
                return false;
            }
            System.out.println("Payment passed Fraud Detection Handler.");
            if (next != null) {
                return next.process(amount);
            }
            return true;
        }
    }

    static class CreditLimitHandler implements PaymentHandler {
        private PaymentHandler next;

        @Override
        public void setNext(PaymentHandler next) {
            this.next = next;
        }

        @Override
        public boolean process(double amount) {
            if (amount > 500) {
                System.out.println("Payment declined by Credit Limit Handler. Credit limit exceeded.");
                return false;
            }
            System.out.println("Payment passed Credit Limit Handler.");
            if (next != null) {
                return next.process(amount);
            }
            return true;
        }
    }

    static class BalanceHandler implements PaymentHandler {
        private PaymentHandler next;

        @Override
        public void setNext(PaymentHandler next) {
            this.next = next;
        }

        @Override
        public boolean process(double amount) {
            if (amount > 100) {
                System.out.println("Payment declined by Balance Handler. Insufficient balance.");
                return false;
            }
            System.out.println("Payment passed Balance Handler.");
            if (next != null) {
                return next.process(amount);
            }
            return true;
        }
    }

    public static class Main {
        public static void main(String[] args) {
            PaymentHandler fraudDetectionHandler = new FraudDetectionHandler();
            PaymentHandler creditLimitHandler = new CreditLimitHandler();
            PaymentHandler balanceHandler = new BalanceHandler();

            fraudDetectionHandler.setNext(creditLimitHandler);
            creditLimitHandler.setNext(balanceHandler);

            fraudDetectionHandler.process(200);
            System.out.println("");
            fraudDetectionHandler.process(600);
            System.out.println("");
            fraudDetectionHandler.process(100);
        }
    }

}
