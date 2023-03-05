package com.company.swift;

public abstract class Swift {

    public void receive(){
        check();
        doPersistenceActions();
        doBusinessActions();
        finalizeProcess();
    }

    public void send(){
        buildSwift();
        retrieveData();
        doBusinessActions();
        finalizeProcess();
    }

    protected void check(){

    }

    protected void doPersistenceActions(){

    }

    protected void doBusinessActions(){

    }

    protected void buildSwift(){

    }

    protected void retrieveData(){

    }

    private void finalizeProcess(){

    }

}
