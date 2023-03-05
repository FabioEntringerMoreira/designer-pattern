package com.company.strtucturals.decorator.multDecorators;

import com.company.strtucturals.decorator.multDecorators.formatterInterface.AddressFormatter;

public class SimplesAddressWithLines extends AddressFormatterDecorator{

    public SimplesAddressWithLines(AddressFormatter addressFormatter){
        super(addressFormatter);
        this.addressFormatter = addressFormatter;
    }

    @Override
    public String formatteAdress(Address address) {
        String formattedAddress = addressFormatter.formatteAdress(address);
        StringBuilder sb = new StringBuilder();
        sb.append(formattedAddress);
        sb.append("-------------");
        return sb.toString();
    }
}
