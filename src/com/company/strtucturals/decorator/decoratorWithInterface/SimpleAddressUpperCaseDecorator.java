package com.company.strtucturals.decorator.decoratorWithInterface;

import com.company.strtucturals.decorator.decoratorWithInterface.formatterInterface.AddressFormatter;

public class SimpleAddressUpperCaseDecorator implements AddressFormatter {

    private AddressFormatter addressFormatter;

    public SimpleAddressUpperCaseDecorator(AddressFormatter addressFormatter){
        this.addressFormatter = addressFormatter;
    }

    @Override
    public String formatteAdress(Address address) {
        return this.addressFormatter.formatteAdress(address).toUpperCase();
    }
}
