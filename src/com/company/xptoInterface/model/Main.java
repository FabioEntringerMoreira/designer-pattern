package com.company.xptoInterface.model;

public class Main {

    public static void main(String[] args) {
        Notebook notebook = new Notebook("Macbook", 5, 120);

        Rent rent = new RentPerDay(notebook);
        double totalPrice = rent.calculateTotalPrice(10);

        System.out.println("Total price value: R$" + totalPrice);
    }
}
