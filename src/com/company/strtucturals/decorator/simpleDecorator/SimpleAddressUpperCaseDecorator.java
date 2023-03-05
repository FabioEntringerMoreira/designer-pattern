package com.company.strtucturals.decorator.simpleDecorator;

public class SimpleAddressUpperCaseDecorator {

    private final SimpleAddress simpleAddress;

    public SimpleAddressUpperCaseDecorator(SimpleAddress simpleAddress){
        this.simpleAddress = simpleAddress;
    }

    public String prepareAddress(){
        return this.simpleAddress.prepareAddress().toUpperCase();
    }
}
