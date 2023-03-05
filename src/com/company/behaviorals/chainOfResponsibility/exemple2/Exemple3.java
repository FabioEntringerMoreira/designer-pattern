package com.company.behaviorals.chainOfResponsibility.exemple2;

public class Exemple3 {

    interface BudgetApprover {
        void setNext(BudgetApprover next);
        void processBudget(double amount);
    }

    static class Manager implements BudgetApprover {
        private BudgetApprover next;

        @Override
        public void setNext(BudgetApprover next) {
            this.next = next;
        }

        @Override
        public void processBudget(double amount) {
            if (amount <= 10000) {
                System.out.println("Budget approved by Manager.");
            } else if (next != null) {
                next.processBudget(amount);
            }
        }
    }

    static class Director implements BudgetApprover {
        private BudgetApprover next;

        @Override
        public void setNext(BudgetApprover next) {
            this.next = next;
        }

        @Override
        public void processBudget(double amount) {
            if (amount <= 20000) {
                System.out.println("Budget approved by Director.");
            } else if (next != null) {
                next.processBudget(amount);
            }
        }
    }

    static class President implements BudgetApprover {
        private BudgetApprover next;

        @Override
        public void setNext(BudgetApprover next) {
            this.next = next;
        }

        @Override
        public void processBudget(double amount) {
            System.out.println("Budget approved by President.");
        }
    }

    public static class Main {
        public static void main(String[] args) {
            Manager manager = new Manager();
            Director director = new Director();
            President president = new President();

            manager.setNext(director);
            director.setNext(president);

            manager.processBudget(6000);
            System.out.println("");
            manager.processBudget(18000);
            System.out.println("");
            manager.processBudget(25000);
        }
    }

}
