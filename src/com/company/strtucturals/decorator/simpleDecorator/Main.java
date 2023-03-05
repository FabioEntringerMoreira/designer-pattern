package com.company.strtucturals.decorator.simpleDecorator;

public class Main {

    public static void main(String[] args) {

        /*SimpleAddress simpleAddress = new SimpleAddress(address);
        String formattedAddress = simpleAddress.prepareAddress();
        System.out.println(formattedAddress);*/

        SimpleAddressUpperCaseDecorator decorator = new SimpleAddressUpperCaseDecorator(
                new SimpleAddress(
                        new Address("Somewhere", "Neverland",
                "NY", "123456-7")));

        String decoratedFormattedAdders = decorator.prepareAddress();
        System.out.println(decoratedFormattedAdders);

    }
}
