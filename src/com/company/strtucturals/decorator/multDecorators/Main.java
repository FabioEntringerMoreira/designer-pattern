package com.company.strtucturals.decorator.multDecorators;

import com.company.strtucturals.decorator.multDecorators.formatterInterface.AddressFormatter;

public class Main {

    public static void main(String[] args) {

        Address address = new Address("Somewhere", "Neverland",
                "NY", "123456-7");


        AddressFormatter formatter = new SimplesAddressWithLines(
                new SimpleAddressUpperCase(
                        new SimpleAddress()));
        System.out.println(formatter.formatteAdress(address));

    }
}
