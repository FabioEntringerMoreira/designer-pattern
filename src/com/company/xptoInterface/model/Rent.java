package com.company.xptoInterface.model;

public abstract class Rent {

    private Notebook notebook;

    public Rent(Notebook notebook) {
        this.notebook = notebook;
    }

    public Notebook getNotebook() {
        return notebook;
    }

    public abstract double calculateTotalPrice(int hoursOfRent);
}
