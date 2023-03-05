package com.company.strtucturals.decorator.simpleDecorator;

public class SimpleAddress {

    private final Address address;

    SimpleAddress(Address address){
        this.address = address;
    }

    public String prepareAddress(){
        return "\n" +
                this.address.getCity() +
                "\n" +
                this.address.getStreetAddress() +
                "\n" +
                this.address.getState() +
                "\n" +
                this.address.getZipCode();
    }
}
