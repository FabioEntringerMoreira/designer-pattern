package com.company.strtucturals.decorator.decoratorWithInterface;

import com.company.strtucturals.decorator.decoratorWithInterface.formatterInterface.AddressFormatter;

public class SimpleAddress implements AddressFormatter {

    @Override
    public String formatteAdress(Address address) {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append(address.getCity());
        sb.append("\n");
        sb.append(address.getStreetAddress());
        sb.append("\n");
        sb.append(address.getState());
        sb.append("\n");
        sb.append(address.getZipCode());
        return sb.toString();
    }
}
