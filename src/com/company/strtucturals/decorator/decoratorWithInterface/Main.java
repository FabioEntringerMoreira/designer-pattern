package com.company.strtucturals.decorator.decoratorWithInterface;

import com.company.strtucturals.decorator.decoratorWithInterface.formatterInterface.AddressFormatter;

public class Main {

    public static void main(String[] args) {

        Address address = new Address("Somewhere", "Neverland",
                "NY", "123456-7");


        AddressFormatter formatter = new SimpleAddressUpperCaseDecorator(new SimpleAddress());
        System.out.println(formatter.formatteAdress(address));

    }
}
