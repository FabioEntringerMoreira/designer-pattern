package com.company.swift;

public class M001 extends Swift{

    @Override
    protected void check() {
        System.out.println("Check M001");
    }

    @Override
    protected void doPersistenceActions() {
        System.out.println("doPersistence in M001");
    }

    @Override
    protected void doBusinessActions() {
        System.out.println("doBusinessActions in M001");
    }


}
