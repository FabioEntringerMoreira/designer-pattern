package com.company.strtucturals.decorator.multDecorators;

import com.company.strtucturals.decorator.multDecorators.formatterInterface.AddressFormatter;

public class SimpleAddressUpperCase extends AddressFormatterDecorator {

    public SimpleAddressUpperCase(AddressFormatter addressFormatter){
        super(addressFormatter);
    }

    public String formatteAdress(Address address) {
        return addressFormatter.formatteAdress(address).toUpperCase();
    }
}
